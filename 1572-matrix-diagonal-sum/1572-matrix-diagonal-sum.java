class Solution {
    public int diagonalSum(int[][] mat) {

        int len = mat.length;
        int sum = 0;

        for( int i = 0 ; i < len ; i++){
            sum += mat[i][i];
        }

        for( int i = 0, j = mat[0].length -1; i < mat.length && j >= 0; i ++ ,j--){
                sum += mat[i][j];
        }

        if(len%2!=0){
            sum-= mat[len/2][len/2];
        }

        return sum;
        
    }
}

