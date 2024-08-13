import java.util.*;
class Solution {
    public Integer solution(int[] A, int[] B) {
        Integer answer = 0;
        Arrays.sort(A);
        Integer[] B1 = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(B1, Collections.reverseOrder());
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B1[i];
        }

        return answer;
    }
}