class Solution {
    public int mySqrt(int x) {
        // if (x == 0) {
        //     return 0;
        // } else if (x < 4) {
        //     return 1;
        // } else {
        //     for (int i = 1; i*i <= x; i++) {
        //         if ((i * i) == x) {
        //             return i;
        //         } else if ((i * i) > x) {
        //             return i - 1;
        //         }
        //     }
        // }

        // return 0;

        if(x == 0 || x == 1){
            return x;
        }

        int start = 1;
        int end = x;
        int mid = -1;

        while(start <= end){
            mid = start +(end-start)/2;
            if (mid*mid == x)
                return mid;
            else if((long) mid*mid > (long) x)
                end = mid-1;
            else
                start = mid+1;
        }
        return Math.round(end);
    }
}