class Solution {
    public long solution(long n) {
        long answer = 0;
        long a1 = (long) Math.sqrt(n);
        long a2 = (long) Math.pow(a1, 2);
        if (a2 != n) {
            answer = -1;
            return answer;
        }
        answer = (long) Math.pow(a1 + 1, 2);
        return answer;
    }
}