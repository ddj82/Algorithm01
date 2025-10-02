import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] fail = new int[N];
        int[] start = new int[N];
        Map<Integer, Double> failPerMap = new HashMap<>();
        
        for (int i = 0; i < start.length; i++) {
            start[i] = stages.length;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i) {
                    fail[i - 1]++;
                }

                if (stages[j] < i) {
                    start[i - 1]--;
                }

            }
        }
        
        for (int i = 0; i < fail.length; i++) {
            if (fail[i] == 0 && start[i] == 0) {
                failPerMap.put(i + 1, 0.0);
            } else {
                failPerMap.put(i + 1, (double) fail[i] / start[i]);
            }
        }
        
        List<Integer> keySet = new ArrayList<>(failPerMap.keySet());
        keySet.sort((o1, o2) -> failPerMap.get(o2).compareTo(failPerMap.get(o1)));
        
        for (int i = 0; i < keySet.size(); i++) {
            answer[i] = keySet.get(i);
        }
        
        return answer;
    }
}