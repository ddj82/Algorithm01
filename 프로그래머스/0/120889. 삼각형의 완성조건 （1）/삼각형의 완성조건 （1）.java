import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int a = sides[0] + sides[1];
        if(sides[2] >= a) {
            answer = 2;
        } else {
            answer = 1;
        }
        return answer;
    }
}