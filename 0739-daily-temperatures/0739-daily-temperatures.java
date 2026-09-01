class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int[] res = new int[n];

        // for(int i = 0 ; i < n-1 ; i++){
        //     int count = 0;
        //     int curr = t[i];
        //     int j;
        //     for(j = i+1 ; j < n ; j ++){
        //         if(t[j] > curr){
        //             count++;
        //             break;
        //         }else{
        //             count++;
        //         }
        //     }
        //     if(j < n && t[j] > curr)
        //         res[i] = count;
        //     else
        //         res[i] = 0;
        // }

        // return res;

        // the above approach excedds the time..
        // we will do it using stack
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 1 ; i < n ; i++){
            while(!stack.isEmpty() && t[stack.peek()]<t[i]){
                res[stack.peek()] = i- stack.pop();
            }
            stack.push(i);
        }
        return res;

    }
}