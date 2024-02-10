class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a = hp / 5;
        int b = hp % 5;
        if (hp % 5 == 0) {
            answer = a;
        } else {
            if (b >= 4) {
                answer = a + 2;
            } else if (b == 3) {
                answer = a + 1;
            } else {
                answer = a + b;
            }
        }
        return answer;
    }
}