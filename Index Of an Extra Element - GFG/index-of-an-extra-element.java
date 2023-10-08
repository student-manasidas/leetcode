//{ Driver Code Starts
import java.util.*;
class ExtraElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n - 1];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n - 1; i++) b[i] = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.findExtra(a, b, n));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class Solution {
    
    public int findExtra(int a[], int b[], int n) {
        // add code here.
    //     int low=0;
    //     int high=n-1;
    //     int ans=n;
    //     while(low<=high){
    //         int mid=low+(high-low)/2;
    //         if(a[mid]==b[mid]){
    //             low=mid+1;
    //         }
    //         else{
    //           ans= mid;
    //           high=mid-1;
    //         }
    //     }
    //   return ans;
    int sum1=0;
    int sum2=0;
     // First the traverse all array and then I find out total sum of the first array
     for(int i=0;i<n;i++){
         sum1+=a[i];
     }
     for(int i=0;i<b.length;i++){
         sum2+=b[i];
     }
     int sum=sum1-sum2;
     for(int i=0;i<n;i++){
         if(sum==a[i]){
             return i;
         }
     }
     return -1;
        
    }
}