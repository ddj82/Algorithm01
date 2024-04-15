import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        List<String> s = new ArrayList<>();
        String s1 = "";
        int idx = 1;
        for (int i = 0;  i < my_str.length(); i++) {
            if (idx <= n) {
                s1 += my_str.charAt(i);
                idx++;
            } else {
                s.add(s1);
                idx = 1;
                s1 = "";
                i--;
            }
        }
        if (!(s1.equals(""))){
            s.add(s1);
        }
        String[] answer = s.stream().toArray(String[]::new);
        return answer;
    }
}