//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    int k = Integer.parseInt(br.readLine().trim());
		    
		    Solution ob= new Solution();
		    System.out.println(ob.countKdivPairs(arr, n, k));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static long countKdivPairs(int arr[], int n, int k)
    {
        //code here
        HashMap<Integer,Integer>map=new HashMap<>();
        long count=0;
        for(int i=0;i<n;i++){
            int rem=arr[i]%k;
            // When remember is zero my count increase
            if(rem==0){
                int val=map.getOrDefault(rem,0);
                count+=val;
            }
            else{
                // It check rem is not zero so I will find out difference between k-rem and check 
                // this value is present in hashmap or not
                int val=map.getOrDefault(k-rem,0);
                count+=val;
            }
            // everytime i will store my remender value 
            int oldvalue=map.getOrDefault(rem,0);
            map.put(rem,oldvalue+1);
        }
        return count;
    }
}