class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        else{
            int y = reverse(x);
            if(x!=y)
                return false;
        }
        return true;
    }
    public int reverse(int x){
        int y = 0;
        int rem = 0;

        while(x!=0){
            rem = x%10;
            y = (y*10)+rem;
            x /= 10;
        }

        return y;
    }
}