class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int n1 = n;
        int m1 = m;
        int r = 0;
        
        if (n1 < m1) {
            int a = n1;
            n1 = m1;
            m1 = a;
        }
        
        while (m1 > 0) {
            r = n1 % m1;
            n1 = m1;
            m1 = r;
        }
        answer[0] = n1;
        answer[1] = n * m / n1;
        return answer;
    }
}