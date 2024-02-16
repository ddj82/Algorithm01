import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int m = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > m) {
                m = array[i];
            }
        }
        answer[0] = m;
        answer[1] = Arrays.binarySearch(array, m);
        
        return answer;
    }
}