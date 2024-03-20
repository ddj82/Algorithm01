import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int idx = 0;
        int lastIdx = 0;
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                idx = i;
                break;
            } else {
                x = -1;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                lastIdx = i;
                break;
            } else {
                x = -1;
            }
        }
        List<Integer> a = new ArrayList<>();
        
        if (lastIdx != 0) {
            for (int i = idx; i <= lastIdx; i++) {
                a.add(arr[i]);
            }
        } else if (x == -1) {
            a.add(-1);
        }
        
        int[] answer = a.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}