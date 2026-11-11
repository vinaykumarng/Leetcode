class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int start = 0;
        int end = 0;
        for(int x : nums){
            start = Math.max(start,x);
            end += x;
        }
        int ans = 0;
        while(start <=  end){
            int mid = start+(end-start)/2;
            int parts = 1;
            int cur = 0;
            for(int x : nums){
                if(cur+x > mid){
                    parts++;
                    cur = x;
                }else{
                    cur+=x;
                }
            }
            System.out.println(parts);
            if(parts<= k){
                ans = mid;
                end = mid -1;
            }else{
                start = mid+1;
            }
        }

        return ans;




        // for(int i = start; i<=end ; i++){
        //     int parts = 1; 
        //     int cur = 0;
        //     for(int j = 0 ; j < n ; j++){
        //         if(cur+nums[j] > i){
        //             parts++;
        //             cur = nums[j];
        //         }else{
        //             cur += nums[j];
        //         }
        //     }
        //     System.out.println(parts);
        //     if(parts == k){
        //         return i;
        //     }
        // }
        // return 0;
        
    }
}