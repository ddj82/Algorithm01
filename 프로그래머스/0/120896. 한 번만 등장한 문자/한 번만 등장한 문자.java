import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                answer += s.charAt(i);
            }
        }
        String[] str = answer.split("");
        Arrays.sort(str);
        answer = "";
        for (int i = 0; i < str.length; i++) {
            answer += str[i];
        }
        
        return answer;
    }
}