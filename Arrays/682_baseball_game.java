class Solution {
    public int calPoints(String[] operations) {
      Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                stack.pop();
            } else if (operations[i].equals("D")) {
                stack.push(2 * stack.peek());
            } else if (operations[i].equals("+")) {
                int a = stack.pop();
                int res = a + stack.peek();
                stack.push(a);
                stack.push(res);
            } else stack.push(Integer.valueOf(operations[i]));
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }

        return res;  
    }
}