import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List<Integer> a = new ArrayList<>();
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            a.add(arr[i]);
        }
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            a.add(arr[i]);
        }
        
        return a.stream().mapToInt(i -> i).toArray();
    }
}