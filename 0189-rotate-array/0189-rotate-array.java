class Solution {

    public void ReverseArray(int[] nums , int i, int j){
        int len = (i+j)/2;
        for(int start = i, end = j ; start <= len; start++, end--){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        if(k == 0){
            return;
        }
        if(n == 0 || n == 1){
            return ;
        }
        // System.out.println(n);
        // System.out.println(k);
        // System.out.println(k);
        ReverseArray(nums,0,n-1);
        ReverseArray(nums,0,k-1);
        ReverseArray(nums,k,n-1);
    }
}