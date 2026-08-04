class Solution {
    public int searchInsert(int[] nums, int target) {
        int res;
        int len = nums.length;

        int prev = 0;
        for( int i = 0 ; i < len ; i++ ){
            if(nums[i] == target || nums[i] > target){
                return i;
            }
        }

        return len;
    }
}