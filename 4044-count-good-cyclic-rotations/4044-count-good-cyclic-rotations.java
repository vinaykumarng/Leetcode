class Solution {
    public int countGoodRotations(int[] nums) {
        // count total 
        int n = nums.length;
        int half = n/2;

        long total = 0;
        for(int i = 0 ; i < n ; i++){
            total+=nums[i];
        }

        // count half as window
        long window = 0;
        for(int i = 0 ; i < half;i++){
            window += nums[i];
        }

        
        // if window > total - window ans++ else remove prev ele and add next next ele
        int ans = 0;
        for(int i = 0 ; i < n; i++){
            if(window > total - window) ans++;
            window -= nums[i];
            window += nums[(i+half)%n];
        }
        return ans;
    }
}