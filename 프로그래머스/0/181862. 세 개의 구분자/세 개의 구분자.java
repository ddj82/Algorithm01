import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        List<String> s = new ArrayList<>();
        String s1 = "";
        for (int i = 0; i < myStr.length(); i++) {
            if (!(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c')) {
                s1 += myStr.charAt(i);
                if (i ==  myStr.length() - 1) {
                    s.add(s1);
                }
            } else {
                if (s1.equals("")) {
                    continue;
                } else {
                    s.add(s1);
                    s1 = "";
                }
            }
        }
        if (s.size() == 0) {
            s.add("EMPTY");
        }
        String[] answer = s.stream().toArray(String[]::new);
        return answer;
    }
}