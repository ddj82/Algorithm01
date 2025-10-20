class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
        for (int i = 1; i <= n / 2; i++) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
            if (a == b) break;
        }

        return answer;
    }
}