import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                a.add(arr[i]);
            }
        }
        if (a.size() == 0) {
            a.add(-1);
        }
        int[] answer = a.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}