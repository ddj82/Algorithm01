class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] n = new int[included.length];
        for (int i = 0; i < included.length; i++) {
            if (i == 0) {
                n[i] = a;
            } else {
                n[i] = n[i - 1] + d;
            }
        }
        for (int i = 0; i < included.length; i++) {
            if (included[i] == true) {
                answer += n[i];
            }
        }
        return answer;
    }
}