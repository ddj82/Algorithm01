class Solution {
    public int solution(long num) {
        int answer = 0;
        int c = 0;
        if (num > 1) {
            while (c < 500) {
                if (num % 2 == 0) {
                    num /= 2;
                    c++;
                } else {
                    num = (num * 3) + 1;
                    c++;
                }
                
                if (num == 1) {
                    answer = c;
                    break;
                }
            }
        }
        if (c == 500) {
            answer = -1;
        }
        return answer;
    }
}