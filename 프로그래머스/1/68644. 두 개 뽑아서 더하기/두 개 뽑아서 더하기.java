import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    s.add(numbers[i] + numbers[j]);
                }
            }
        }
        int[] answer = s.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}