class Solution {
    public int sumOfBeauties(int[] nums) {
        int res = 0;
        int len = nums.length;

        // if (len < 3){
        //     return 0;
        // }

        // for( int i = 1 ; i < len-1 ; i++){
        //     boolean isLeft = true;
        //     boolean isRight = true;
        //     for(int j = 0 ; j < i ; j++ ){
        //         if(nums[j] >= nums[i]){
        //             isLeft = false;
        //             break;
        //         }
        //     }

        //     for(int k = i+1; k < len ; k++){
        //         if(nums[k] <= nums[i]){
        //             isRight = false;
        //             break;
        //         }
        //     }

        //     if(isRight && isLeft){
        //         res +=2;
        //     }else if(nums[i-1] < nums[i] && nums[i] < nums[i+1]){
        //         res+=1;
        //     }
        // }

        // prefix max and suffix min

        int [] prefixMax = new int[len];

        prefixMax[0] = nums[0];


        for(int i = 1; i < len; i++){
            prefixMax[i] = Math.max(prefixMax[i-1], nums[i]);
        }

        int [] suffixMin = new int[len];
        suffixMin[len-1] = nums[len-1];


        for (int i = len-2 ; i >= 0 ; i--){
            suffixMin[i] = Math.min(suffixMin[i+1], nums[i]);
        }

        for( int i = 1 ; i <= len-2 ; i++){
            if(prefixMax[i-1] < nums[i] && nums[i] < suffixMin[i+1])
                res+=2;
            else if(nums[i-1] < nums[i] && nums[i] < nums[i+1])
                res+=1;
        }

        return res;
    }
}