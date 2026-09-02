class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> newMap = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i ++){
            newMap.put(nums[i] , i);
        }

        for(int i = 0 ; i < n ; i ++){
            int comp = target - nums[i];
            if(newMap.containsKey(comp) && newMap.get(comp) != i)
                return new int[]{i,newMap.get(comp)};
        }
        return new int[]{};
    }
}