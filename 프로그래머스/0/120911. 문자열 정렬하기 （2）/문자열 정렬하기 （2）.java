import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String s = my_string.toLowerCase();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        for (int i = 0; i < c.length; i++) {
            answer += c[i];
        }
        return answer;
    }
}