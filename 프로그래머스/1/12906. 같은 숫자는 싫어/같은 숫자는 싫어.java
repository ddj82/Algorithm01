import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> a1 = new ArrayList<>();
        int a = arr[0];
        a1.add(a);
        for (int i = 1; i < arr.length; i++) {
            if (a != arr[i]) {
                a = arr[i];
                a1.add(a);
            }
            
        }
        int[] answer = a1.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}