class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prev = new HashMap<>();

        for(int i=0; i < nums.length; i++) { 
            int num = nums[i];
            int diff = target - num;

            if(prev.containsKey(diff)) {
                return new int[] {
                   prev.get(diff), i
                };
                
            }
            prev.put(num, i);
        }
        return new int[] {};
    }

}
