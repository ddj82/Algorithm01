import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> s = new ArrayList<>();
        String str = "";
        for (int i = 0; i < my_string.length(); i++) {
        	str = my_string.substring(i, my_string.length());
        	s.add(str);
        }
        String[] answer = s.toArray(String[]::new);
        Arrays.sort(answer);
        return answer;
    }
}