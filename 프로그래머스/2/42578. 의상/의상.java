import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> cody = new HashMap<>();

        for (String[] row : clothes) {
            cody.put(row[1], cody.getOrDefault(row[1], 0) + 1);
        }

        for (Integer i : cody.values()) {
            answer *= (i + 1);
        }

        answer -= 1;
        
        return answer;
    }
}