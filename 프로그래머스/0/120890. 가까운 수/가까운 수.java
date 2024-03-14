import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(n - answer) > Math.abs(n - array[i])) {
                answer = array[i];
            } else if (Math.abs(n - answer) == Math.abs(n - array[i])) {
                if (answer > array[i]) {
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}