class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String ch : tokens ){
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                int c = 0; 
                switch(ch){
                    case "+":
                        c=a+b;
                        break;
                    case "-":
                        c=a-b;
                        break;
                    case "*":
                        c=a*b;
                        break;
                    case "/":
                        c=a/b;
                        break;
                    default :
                        break;
                }
                stack.push(c);
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }

        return stack.pop();

    }
}