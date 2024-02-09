class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 1;
        int b = 0;
        for (int i : num_list) {
            a *= i;
            b += i;
        }
         b *= b;
        if (a < b) {
            answer = 1;
        }
        return answer;
    }
}