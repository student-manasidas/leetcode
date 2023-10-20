//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int arr [] = new int[N];
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<N;i++){
	            arr[i] = Integer.parseInt(elements[i]);    
	        }
		    int K = Integer.parseInt(br.readLine());
		    
		    Complete obj = new Complete();
		    ArrayList<Integer> ans;
		    ans = obj.deleteElement(arr, N, K);
        	for(int i: ans)
        	    System.out.print(i + " ");
        	System.out.println();
		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Complete{
    
   
    // Function for finding maximum and value pair
    public static ArrayList<Integer> deleteElement (int arr[], int n, int k) {
        //Complete the function
        ArrayList<Integer>list=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        int count=0;
        st.push(arr[0]);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && st.peek()<arr[i] && count<k){
                st.pop();
                count++;
            }
            st.push(arr[i]);
        }
        int m=st.size();
        int[] ans=new int[m];
        while(!st.isEmpty()){
            ans[m-1]=st.peek();
            st.pop();
            m--;
        }
        for(int i=0;i<ans.length;i++){
            list.add(ans[i]);
        }
        return list;
    }
    
    
}