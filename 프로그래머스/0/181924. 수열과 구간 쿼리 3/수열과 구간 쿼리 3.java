class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < queries.length; i++) {
            a = queries[i][0];
            b = queries[i][1];
            c = answer[a];
            answer[a] = answer[b];
            answer[b] = c;
        }
        
        return answer;
    }
}