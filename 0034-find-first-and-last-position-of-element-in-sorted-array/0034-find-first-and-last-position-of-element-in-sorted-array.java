class Solution {
    public int upperBound(int[] arr, int x){
        int n = arr.length;
        int l = 0 ,h = n-1;
        int ans = n;

        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid] > x){
                ans = mid;
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
    public int lowerBound(int[] arr, int x){
        int n = arr.length;
        int l = 0 , h = n-1;
        int ans = n;

        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid] >= x){
                ans = mid;
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums, target);
        if(lb == nums.length || nums[lb] != target) return new int[] {-1,-1};
        else return new int[]{lb, upperBound(nums, target)-1};
    }
}