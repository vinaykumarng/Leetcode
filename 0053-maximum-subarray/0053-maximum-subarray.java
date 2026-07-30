class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int max = currSum;
        int len = nums.length;

        for(int i = 1 ; i < len ; i ++){
            if(currSum + nums[i]  > nums[i]){
                currSum+= nums[i];
                if(currSum > max){
                    max = currSum;
                }
            }
            else {
                currSum = nums[i];
                if(currSum > max){
                    max = currSum;
                }
            }
        }
        return max;
    }
}