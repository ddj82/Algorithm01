class Solution {
    public int solution(int n) {
        int answer = 0;
        int c = 0;
        int idx = 1;
        for (int i = 1; i <= n; i++) {
            c += i;
            if (i == n) {
                answer++;
                break;
            }
            
            if (c == n) {
                answer++;
            } else if (c > n) {
                idx++;
                c = 0;
                i = idx;
            }
        }
        return answer;
    }
}