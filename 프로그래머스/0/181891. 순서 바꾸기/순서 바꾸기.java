import java.util.*;
class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            answer.add(num_list[i]);
        }
        int a = 0;
        for (int i = n; i < num_list.length; i++) {
            answer.add(a, num_list[i]);
            a++;
        }
        return answer;
    }
}