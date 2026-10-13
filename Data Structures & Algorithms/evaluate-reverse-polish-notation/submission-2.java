class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i; i < tokens.length; i++) {
            if (tokens[i].matches("[0-9]")) {
                stack.push(Integer.parseInt(tokens[i]));
            } else if (tokens[i] == "+") {
                int x = stack.pop();
                int y = stack.pop();

                stack.push(x + y);
            } else if (tokens[i] == "-") {
                int x = stack.pop();
                int y = stack.pop();

                stack.push(y - x);
            } else if (tokens[i] == "/") {
                int x = stack.pop();
                int y = stack.pop();

                stack.push(y / x);
            } else if (tokens[i] == "*") {
                int x = stack.pop();
                int y = stack.pop();

                stack.push(x * y);
            }
        }
        return stack.peek();
    }
}
