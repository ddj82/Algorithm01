import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] s1 = s.split(" ");
        int[] a = new int[s1.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(s1[i]);
        }
        Arrays.sort(a);
        answer = a[0] + " " + a[a.length - 1];
        return answer;
    }
}