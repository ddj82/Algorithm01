import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = Integer.toString(k);
        for (int z = i; z <= j; z++) {
            String s = Integer.toString(z);
            String[] s2 = s.split("");
            for (int x = 0; x < s2.length; x++) {
                if (s2[x].contains(str)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}