import java.util.*;
import static java.lang.Math.max;
import static java.lang.Math.min;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        List<String> s1 = new ArrayList<>();
        List<String> s2 = new ArrayList<>();

        for (int i = 0; i < str1.length() - 1; i++) {
            String s = str1.substring(i, i + 2);
            if (s.matches("[a-zA-Z]{2}")) {
                s1.add(s.toUpperCase());
            }
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            String s = str2.substring(i, i + 2);
            if (s.matches("[a-zA-Z]{2}")) {
                s2.add(s.toUpperCase());
            }
        }
        
        if (s1.isEmpty() && s2.isEmpty()) {
            return 65536;
        }

        List<String> Lists2 = new ArrayList<>(s2);
        List<String> Listmin = new ArrayList<>();
        List<String> Listmax = new ArrayList<>(s2);

        for (String s : s1) {
            if (Lists2.contains(s)) {
                Listmin.add(s);
                Lists2.remove(s);
            }
            Listmax.add(s);
        }

        for (String s : Listmin) {
            Listmax.remove(s);
        }
        
        double j = (double) Listmin.size() / Listmax.size();
        answer = (int) (j * 65536);
        
        return answer;
    }
}