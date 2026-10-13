class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (char c : tokens) {
            if (c.equals("+")) {
                stack.push(stack.pop + stack.pop());
            } else if (c.equals("-")) {
                int y = stack.pop();
                int x = stack.pop();

                stack.push(x - y);
            } else if (c.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (c.equals("/")) {
                int y = stack.pop();
                int x = stack.pop();

                stack.push(x / y);
            } else {
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.peek();
    }
}
