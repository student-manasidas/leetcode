class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int totalsum=n*(n+1)/2;
        for(int i=0;i<n;i++){
            totalsum=totalsum-nums[i];
            
        }
        return totalsum;
        
    }
}