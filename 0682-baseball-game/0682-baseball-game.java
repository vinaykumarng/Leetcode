class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        // int len = operations.length;
        for(String op : operations){
            if(op.equals("C")){
                int removed = stack.pop();
                sum -= removed;
            }else if(op.equals("D")){
                int score = stack.peek() * 2;
                stack.push(score);
                sum += score;
            }
            else if(op.equals("+")){
                int top = stack.pop();
                int score = top + stack.peek();
                stack.push(top);
                stack.push(score);
                sum +=score;
            }
            else{
                int score = Integer.parseInt(op);
                stack.push(score);
                sum +=score;
            }
        }

        return sum;
    }
}