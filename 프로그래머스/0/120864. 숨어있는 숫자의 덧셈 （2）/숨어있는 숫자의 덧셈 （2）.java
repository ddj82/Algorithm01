import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = "";
        List<String> s = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                str += my_string.charAt(i);
            } else {
                if (str != "") {
                    s.add(str);
                    str = "";
                }
            }
        }
        if (str != "") {
            s.add(str);
        }
        for (int i = 0; i < s.size(); i++) {
            answer += Integer.parseInt(s.get(i));
        }
        return answer;
    }
}