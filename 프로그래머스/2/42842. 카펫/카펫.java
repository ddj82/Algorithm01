import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        int width = 0;
        int height = 0;

         for (int i = 1; i <= total; i++) {
             if (total % i == 0) {
                 int pair = total / i;

                 if (((i - 2) * (pair - 2)) == yellow) {
                     if (i >= pair) {
                         width = i;
                         height = pair;
                     } else {
                         width = pair;
                         height = i;
                     }
                     break;
                 }
             }
         }
        
        int[] answer = {width, height};
        
        return answer;
    }
}