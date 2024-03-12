import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                answer = 1;
            } else {
                answer = 0;
                break;
            }
        }
        return answer;
    }
}