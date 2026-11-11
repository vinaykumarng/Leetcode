class Solution {
    public boolean isPossible(int[] arr, int dist, int m){
        int n = arr.length;
        int curCount = 1;
        int last = arr[0];

        for(int i = 1; i < n ; i++){
            if(arr[i]-last >= dist){
                curCount++;
                last = arr[i];
            }
        }
        if(curCount >= m) 
            return true;
        else
            return false;

    }
    public int maxDistance(int[] a, int m) {
        int n = a.length;
        Arrays.sort(a);
        int lo = 1, hi = a[n-1];
        int ans = 0;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(isPossible(a,mid,m) == true){
                ans = mid;
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return ans;
        
    }
}