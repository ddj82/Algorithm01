import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            String s1 = s.charAt(i) + "";
            answer += Integer.parseInt(s1);
        }

        return answer;
    }
}