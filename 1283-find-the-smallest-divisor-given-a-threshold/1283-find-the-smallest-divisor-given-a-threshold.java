class Solution {
    public int smallestDivisor(int[] nums, int limit) {
        int n = nums.length;
        int lo = 1;
        int hi = Integer.MIN_VALUE;
        for(int x : nums) hi = Math.max(hi, x);
        int ans = 0;
        while(lo<=hi){
            int i = lo+(hi-lo)/2;
            int s = 0;
            for(int x : nums) {
                s+= (x+i-1L)/i;
            }
            if(s <= limit){
                ans = i;
                hi = i-1;
            }else{
                lo = i+1;
            }
        }

        return ans;
    }
}