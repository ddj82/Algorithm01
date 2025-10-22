import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        long startPos = 0;
        long startIndex = 0;
        long endPos = 0;

        if ((left + 1) <= n) {
            startIndex = left;
        } else {
            startPos = left / n;
            startIndex = left % n;
        }

        if ((right + 1) > n) {
            endPos = right / n;
        }
        
        int length = (int) (right - left + 1);
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            long a = Math.max(startPos, startIndex) + 1;
            answer[i] = (int) a;
            if (startPos <= endPos) {
                if (startIndex < (n - 1)) {
                    startIndex++;
                } else {
                    startPos++;
                    startIndex = 0;
                }
            }
        }
        
        return answer;
    }
}