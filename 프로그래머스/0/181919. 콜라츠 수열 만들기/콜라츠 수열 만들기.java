import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> a = new ArrayList<>();
        a.add(n);
        while (true) {
            if (n % 2 == 0) {
                n /= 2;
                a.add(n);
            } else {
                n = (3 * n) + 1;
                a.add(n);
            }
            if (n == 1) {
                break;
            }
        }
        int[] answer = a.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}