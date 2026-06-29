class Solution {
    public int[] twoSum(int[] nums, int target) {
        int out_index = 0;
        int [] res = new int[2];
        for(out_index = 0 ; out_index < nums.length -1 ; out_index++)
        {
            int in_index = 0;
            for(in_index = out_index+1; in_index < nums.length ; in_index++)
            {
                if((nums[out_index] + nums[in_index]) == target )
                {
                    res[0] = out_index;
                    res[1] = in_index;
                }
            }

        }
        return res;
    }
}