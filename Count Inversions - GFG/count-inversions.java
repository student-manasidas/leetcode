//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

 class Solution {
    static long merge(long arr[], int low, int high, int mid) {
        long ans[] = new long[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        long count = 0;
        while (i <= mid && j <= high) {
            if (arr[i] > arr[j]) {
                ans[k++] = arr[j++];
                count += mid - i + 1;
            } else {
                ans[k++] = arr[i++];
            }
        }
        while (i <= mid) {
            ans[k++] = arr[i++];
        }
        while (j <= high) {
            ans[k++] = arr[j++];
        }
        System.arraycopy(ans, 0, arr, low, ans.length);
        return count;
    }

    static long mergeSort(long arr[], int low, int high) {
        long count = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += merge(arr, low, high, mid);
        }
        return count;
    }

    static long inversionCount(long arr[], long N) {
        return mergeSort(arr, 0, (int) N - 1);
    }
}