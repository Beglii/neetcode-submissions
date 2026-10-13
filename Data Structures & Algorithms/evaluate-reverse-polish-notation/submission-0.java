class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        while(tokens.length != 0) {
            if (s.matches("[0-9]")) {
                stack.push(Integer.parseInt(s));
            } else {
                int x = stack.pop();
                int y = stack.pop();
                int z = x Integer.parseInt(s) y;

                stack.push(z);
            }
        }
        return stack.peek();
    }
}
