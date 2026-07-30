class Solution {
    public boolean isPalindrome(int x) {
        int len = count(x);
        int y = reverse(x,len);
        System.out.println(y);
        if(x < 0)
            return false;
        else{
            while(x!=0 && y!=0){
                if(x%10 != y%10)
                    return false;
                
                x /=10;
                y /=10;
            }
            
        }


        return true;
    }

    public int count(int x){
        int count = 0;
        int rem = 0;
        int copy_x = x;
        while(copy_x != 0){
            copy_x/=10;
            count++;
        }

        return count;
    }

    public int reverse(int x, int count){
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