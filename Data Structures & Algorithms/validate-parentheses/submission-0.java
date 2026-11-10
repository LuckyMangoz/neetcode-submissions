class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeOpen = new HashMap<>();
        closeOpen.put(')', '(');
        closeOpen.put(']', '[');
        closeOpen.put('}', '{');

        for(char c : s.toCharArray()){
            if(closeOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == closeOpen.get(c)) {
                    stack.pop();
                }
                else {
                    return false;
                } 
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
