class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length; 
        int newLen = 2*n;
        int [] ans  = new int[newLen];
        int ans_ind = 0;
        for( int i = 0 ; i < n ; i++ ){
            ans[i] = nums[i];
        }
        for( int i = 0 ; i < n ; i++ ){
            ans[i+n] = nums[i];
        }

        return ans;
    }
}