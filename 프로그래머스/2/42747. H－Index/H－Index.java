import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int i : citations) {
            list.add(i);
        }

        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
             int c = list.get(i);
             if (c >= (i + 1)) {
                 answer = (i + 1);
             }
        }
        
        return answer;
    }
}