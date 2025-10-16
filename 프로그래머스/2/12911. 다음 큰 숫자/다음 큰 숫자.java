class Solution {
    public int solution(int n) {
        int answer = n;
        int bitCount = Integer.bitCount(n);
        int bitCount2 = 0;

        while (bitCount != bitCount2) {
            answer++;
            bitCount2 = Integer.bitCount(answer);
        }
        
        return answer;
    }
}