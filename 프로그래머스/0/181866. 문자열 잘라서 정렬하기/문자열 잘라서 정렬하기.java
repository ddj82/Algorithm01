import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        List<String> s = new ArrayList<>();
        for (int i = 0; i < answer.length; i++) {
            if (!(answer[i].isEmpty())) {
                s.add(answer[i]);
            }
        }
        return s.stream().toArray(String[]::new);
    }
}