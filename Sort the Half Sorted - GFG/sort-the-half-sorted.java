//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		new Solution().sortHalves (arr, n);
    	    for (int i = 0; i < n; ++i)
    	        System.out.print (arr[i] + " ");
    	    System.out.println ();
        }
        
    }
}

// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static void sortHalves (int arr[], int n)
    {
        // your code here
        Arrays.sort(arr);
    }
}