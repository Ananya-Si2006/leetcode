class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int a,b=0;
        for(String ch:tokens)
        {
            if(ch.equals("+"))
            {
                b=stack.pop();
                a=stack.pop();
                stack.push(a+b);
                

            }
            else if(ch.equals("-"))
            {
                b=stack.pop();
                a=stack.pop();
                stack.push(a-b);

            }
            else if(ch.equals("*"))
            {
                b=stack.pop();
                a=stack.pop();
                stack.push(a*b);
            }
            else if (ch.equals("/"))
            {
                b=stack.pop();
                a=stack.pop();
                stack.push(a/b);

            }
            else 
            stack.push(Integer.parseInt(ch));

        }
        return stack.pop();
        
    }
}