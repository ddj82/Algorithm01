import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> finish = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int p = progresses[i];
            int s = speeds[i];
            
            int finishDay = (100 - p) / s;
            int per = (100 - p) % s;
            if (per == 0) {
                finish.offer(finishDay);
            } else {
                finish.offer(finishDay + 1);
            }

        }

        int first = finish.poll();
        int day = 1;

        while (!finish.isEmpty()) {
            int next = finish.poll();
            if (first < next) {
                answer.add(day);
                day = 1;
                first = next;
            } else if (first >= next) {
                day++;
            }
        }
        answer.add(day);
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}