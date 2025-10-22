import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int length = (int) (right - left + 1);
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            long index = left + i;
            long row = index / n;
            long col = index % n;
            answer[i] = (int)(Math.max(row, col) + 1);
        }
        
        return answer;
    }
}