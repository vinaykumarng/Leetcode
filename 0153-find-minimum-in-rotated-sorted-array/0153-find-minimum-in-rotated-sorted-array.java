class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        if(len == 0){
            return 0;
        }

        for(int i = 0 ; i < len-1 ; i++){
            if(nums[i] > nums[i+1]){
                return nums[i+1];
            }
        }

        return nums[0];
    }
}