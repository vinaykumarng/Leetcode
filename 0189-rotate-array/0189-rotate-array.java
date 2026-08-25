class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        if(k == 0){
            return;
        }
        if(n == 0 || n == 1){
            return ;
        }
        ReverseArray(nums,0,n-1);
        ReverseArray(nums,0,k-1);
        ReverseArray(nums,k,n-1);
    }

    
    private void ReverseArray(int[] nums , int left, int right){
        // int len = (left+right)/2;
        // for(int start = left, end = right ; start <= len; start++, end--){
        //     int temp = nums[start];
        //     nums[start] = nums[end];
        //     nums[end] = temp;
        // }
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}