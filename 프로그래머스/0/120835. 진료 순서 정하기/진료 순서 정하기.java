import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = emergency.clone();
        Arrays.sort(answer);
        Map<Integer, Integer> a = new HashMap<>();
        for (int i = 0; i < emergency.length; i++) {
            a.put(answer[i], emergency.length - i);
        }
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = a.get(emergency[i]);
        }
        return answer;
    }
}