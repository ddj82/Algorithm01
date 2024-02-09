import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < num_list.length; i++) {
            if (i >= n - 1) {
                a.add(num_list[i]);
            }
        }
        int[] answer = new int[a.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = a.get(i);
        }
        return answer;
    }
}