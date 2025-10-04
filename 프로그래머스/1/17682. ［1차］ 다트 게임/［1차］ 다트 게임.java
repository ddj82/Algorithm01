import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] dart = dartResult.split("");
        Stack<Integer> stack = new Stack<>();
        StringBuilder num = new StringBuilder();

        for (String s : dart) {
            if (s.matches("\\d")) {
                num.append(s);
            } else {
                if (num.length() > 0) {
                    stack.push(Integer.parseInt(num.toString()));
                    num = new StringBuilder();
                }

                if (s.equals("D")) {
                    int n = stack.pop();
                    stack.push(n * n);
                } else if (s.equals("T")) {
                    int n = stack.pop();
                    stack.push(n * n * n);
                } else if (s.equals("*")) {
                    if (stack.size() > 1) {
                        int n = stack.pop();
                        int befoer = stack.pop();
                        stack.push(befoer * 2);
                        stack.push(n * 2);
                    } else {
                        int n = stack.pop();
                        stack.push(n * 2);
                    }
                } else if (s.equals("#")) {
                    int n = stack.pop();
                    stack.push(n * (-1));
                }
            }
        }
        
        for (Integer i : stack) {
            answer += i;
        }
        
        return answer;
    }
}