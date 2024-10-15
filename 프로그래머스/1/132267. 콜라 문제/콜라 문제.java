class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int a1 = 0;
        int n1 = n;
        while (true) {
            a1 = (n1 / a) * b;
            n1 = a1 + (n1 % a);
            answer += a1;
            if (n1 < a) {
                break;
            }
        }
        
        return answer;
    }
}