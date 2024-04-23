import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (a.size() == 0) {
                a.add(arr[i]);
            } else {
                if (a.get(a.size() - 1) < arr[i]) {
                    a.add(arr[i]);
                } else {
                    a.remove(a.size() - 1);
                    i--;
                }
                
            }
        }
        int[] stk = a.stream().mapToInt(i -> i).toArray();
        return stk;
    }
}