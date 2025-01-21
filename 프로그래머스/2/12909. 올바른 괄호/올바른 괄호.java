import java.util.Stack;

class Solution {
    boolean solution(String s) {
        
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if ("(".equals(String.valueOf(s.charAt(i)))) {
                stack.add(String.valueOf(s.charAt(i)));
                // ) 가 들어 왔을 때
            } else{
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    stack.add(String.valueOf(s.charAt(i)));
                }
            }
        }
        return stack.isEmpty(); 
    }
}