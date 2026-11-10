class Solution {
    public int possible(int[] arr, int day, int m, int k){
        int n = arr.length;
        int count = 0;
        int ans = 0;
        for(int i = 0 ; i<n ; i++){
            if(arr[i] <= day){
                count++;
            }else{
                ans+= (count/k);
                count = 0;
            }
        }
        ans+= (count/k);
        return ans;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long need = m*k;
        if(need > n) return -1;
        int lo = Integer.MAX_VALUE, hi = Integer.MIN_VALUE;

        for(int x : bloomDay){
            lo = Math.min(lo, x);
            hi = Math.max(hi, x);
        }
        // System.out.println("lo: "+lo+" hi: "+hi);

        // for(int i = lo ; i <= hi ; i++){
        //     if(possible(bloomDay, i, m, k)){
        //         return i;
        //     }
        // }

        int ans = -1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int made = possible(bloomDay, mid, m, k);
            if(made >= m) {
                ans = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }

        return ans;
    }
}