class Solution {
    public int solution(int n, int t) {
        int answer = n;
       for (int i = 0; i <= t; i++) {
        if (i == 0) {
            continue;
            }
            answer = answer * 2;
        }
        return answer;
    }
}