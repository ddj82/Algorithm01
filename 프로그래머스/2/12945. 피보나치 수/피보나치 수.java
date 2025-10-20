class Solution {
    public int solution(int n) {
        int answer = 0;
        int f1 = 1;
        int f2 = 0;

        for (int i = 2; i <= n; i++) {
            answer = (f1 + f2) % 1234567;
            f2 = f1;
            f1 = answer;
        }
        
        return answer;
    }
}