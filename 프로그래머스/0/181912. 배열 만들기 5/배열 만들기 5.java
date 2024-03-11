import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            if (k < Integer.parseInt(intStrs[i].substring(s, s + l))) {
                a.add(Integer.parseInt(intStrs[i].substring(s, s + l)));   
            }
        }
        int[] answer = a.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}