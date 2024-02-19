import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        List<Integer> a = new ArrayList<>();
        String s = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                s += my_string.charAt(i);
                a.add(Integer.parseInt(s));
                s = "";
            }
        }
        int[] answer = a.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}