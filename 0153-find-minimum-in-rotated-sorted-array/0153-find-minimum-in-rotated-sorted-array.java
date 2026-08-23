class Solution {
    public int findMin(int[] nums) {
        // int len = nums.length;
        // if(len == 0){
        //     return 0;
        // }

        // for(int i = 0 ; i < len-1 ; i++){
        //     if(nums[i] > nums[i+1]){
        //         return nums[i+1];
        //     }
        // }

        // return nums[0];

        int len = nums.length;
        int last = nums[len-1];
        int left = 0, right = len-1;

        while(left < right){
            int mid = (left+right)/2;
            if(nums[mid] > last)
                left = mid+1;
            else
                right = mid;
        }

        return nums[left];
    }
}