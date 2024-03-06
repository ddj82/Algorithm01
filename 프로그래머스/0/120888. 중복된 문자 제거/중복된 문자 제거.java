import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] cc = my_string.toCharArray();
        List<Character> c = new ArrayList<>();
        for (int i = 0; i < cc.length; i++) {
            if (!(c.contains(cc[i]))) {
                c.add(cc[i]);
            }
        }
        for (int i = 0; i < c.size(); i++) {
            answer += c.get(i);
        }
        return answer;
    }
}