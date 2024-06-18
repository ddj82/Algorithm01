import java.util.*;
class Solution {
    public long solution(long n) {
        String[] s = String.valueOf(n).split("");
        Arrays.sort(s, Collections.reverseOrder());
        String a = "";
        for (int i = 0; i < s.length; i++) {
            a += s[i];
        }
        long answer = Long.parseLong(a);
        return answer;
    }
}