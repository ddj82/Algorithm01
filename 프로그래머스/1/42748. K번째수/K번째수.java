import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < answer.length; i++) {
            int l = commands[i][1] - commands[i][0] + 1;
            int[] a = new int[l];
            int b = commands[i][0] - 1;
            for (int j = 0; j < a.length; j++) {
                a[j] = array[b];
                b++;
            }
            Arrays.sort(a);
            answer[i] = a[commands[i][2] - 1];
        }
        return answer;
    }
}