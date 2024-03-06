class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        for (int i = 0; i < a.length; i++) {
            for (int k = 2; k < a[i]; k++) {
                if (a[i] % k == 0) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}