import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            stack.push(i);
        }

        while (!(stack.size() <= 1)) {
            int a = stack.pop();
            int b = stack.pop();
            int a2 = a;
            int b2 = b;

            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }

            int lcm = (a2 / a) * b2;
            stack.push(lcm);
        }
        
        answer = stack.pop();
        
        return answer;
    }
}