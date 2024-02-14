import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= arr[i]; j++) {
                a.add(arr[i]);
            }
        }
        return a.stream().mapToInt(i -> i).toArray();
    }
}