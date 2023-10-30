class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            int temp = nums1[i];
            int count = 0;
            boolean found = false;
            
            for (int j = 0; j < m; j++) {
                if (found && nums2[j] > temp) {
                    result[i] = nums2[j];
                    count++;
                    break;
                }
                
                if (nums2[j] == temp) {
                    found = true;
                }
            }
            
            if (count == 0) {
                result[i] = -1;
            }
        }
        
        return result;
    }
}