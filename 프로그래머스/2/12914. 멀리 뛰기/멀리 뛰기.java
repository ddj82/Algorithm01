class Solution {
    public long solution(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        
        long answer = 0;
        long f2 = 1;
        long f1 = 2;

        for (int i = 3; i <= n; i++) {
            answer = (f2 + f1) % 1234567;
            f2 = f1;
            f1 = answer;
        }
        
        return answer;
    }
}