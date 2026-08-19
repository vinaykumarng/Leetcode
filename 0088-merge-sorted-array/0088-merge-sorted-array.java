class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Non optimized Approach
        // ArrayList<Integer> nums = new ArrayList<>();

        // for(int i = 0 ; i < m ; i ++ ){
        //     nums.add(nums1[i]);
        // }
        // for(int i = 0 ; i < n ; i ++ ){
        //     nums.add(nums2[i]);
        // }

        // nums.sort(null);
        // int ind = 0;
        // for( int num : nums){
        //     nums1[ind++] = num;
        // }

        // optimized Approach two pointers
        int i = m-1;
        int j = n-1;
        int k = nums1.length-1;

        while( i>=0 && j>=0 ){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }

        while(j >= 0 ){
            nums1[k--] = nums2[j--];
        }
    }
}