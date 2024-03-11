class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for (int i = 0; i < arr.length; i++) {
            for (int s = 0; s < queries.length; s++) {
                if (i >= queries[s][0] && i <= queries[s][1]) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}