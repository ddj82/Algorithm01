import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        // List<Integer> a = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            a.add(arr[i]);
        }
        a.remove(a.indexOf(Collections.min(a)));
        if (a.size() == 0) {
            a.add(-1);
        }
        int[] answer = a.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}