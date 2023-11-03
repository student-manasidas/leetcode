class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer>map=new HashMap<>();
        int maxcount=0;
        int maxfrequen=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                int count=map.get(nums[i]);
                if(count>maxcount){
                    maxcount=count;
                    maxfrequen=nums[i];
                }
            }
        }
        return maxfrequen;
    }
}