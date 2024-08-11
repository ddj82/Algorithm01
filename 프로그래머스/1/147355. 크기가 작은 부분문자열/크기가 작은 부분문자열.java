import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        List<Long> a = new ArrayList<>();
        String s = "";
        int c =  p.length() - 1;
        a:
        for (int i = 0; i < t.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (i + j >= t.length()) {
                    break a;
                }
                s += t.charAt(i + j);
            }
            a.add(Long.parseLong(s));
            s = "";
        }
        
        Long p1 = Long.parseLong(p);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) <= p1) {
                answer++;
            }
        }
        return answer;
    }
}