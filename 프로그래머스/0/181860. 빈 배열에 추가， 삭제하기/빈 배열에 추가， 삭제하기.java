import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 1; j <= arr[i] * 2; j++) {
                    a.add(arr[i]);
                }
            } else if (!(flag[i] && i == 0)) {
                for (int k = 1; k <= arr[i]; k++) {
                    a.remove(a.size() - 1);
                }
            }
        }
        int[] answer = a.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}