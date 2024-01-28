class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa = String.valueOf(a) + String.valueOf(b);
        int a1 = Integer.parseInt(aa);
        int b1 = 2 * a * b;

        if (a1 == b1) {
            answer = a1;
        } else {
            answer = a1 > b1 ? a1 : b1;
        }
        return answer;
    }
}