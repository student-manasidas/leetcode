class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
    HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int mostFrequentEven = -1;
        
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                int count = map.get(num);
                if (count > maxCount) {
                    maxCount = count;
                    mostFrequentEven = num;
                }
            }
        }
        
        return mostFrequentEven;  
    }
}