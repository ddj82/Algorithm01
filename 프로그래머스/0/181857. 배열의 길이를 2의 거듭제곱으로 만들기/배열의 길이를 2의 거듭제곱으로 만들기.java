import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int x = 1;
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            a.add(arr[i]);
        }
        while(true) {
            if (x >= arr.length) {
                if (x == a.size()) {
                    answer = a.stream().mapToInt(i -> i).toArray();
                    break;
                } else if (x > a.size()) {
                    for (int i = a.size(); i < x; i++) {
                        a.add(0);
                    }
                    answer = a.stream().mapToInt(i -> i).toArray();
                    break;
                }
            }
            x *= 2;
        }
        
        return answer;
    }
}