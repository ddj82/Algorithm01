class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] answer1 = new String[n];
        String[] answer2 = new String[n];
        for (int i = 0; i < n; i++) {
            answer1[i] = Integer.toBinaryString(arr1[i]);
            if (answer1[i].length() != n) {
                answer1[i] = "0".repeat(n - answer1[i].length()) + answer1[i];
            }

            answer2[i] = Integer.toBinaryString(arr2[i]);
            if (answer2[i].length() != n) {
                answer2[i] = "0".repeat(n - answer2[i].length()) + answer2[i];
            }
            answer[i] = String.valueOf(Long.parseLong(answer1[i]) + Long.parseLong(answer2[i]));
            if (answer[i].length() != n) {
                answer[i] = "0".repeat(n - answer[i].length()) + answer[i];
            }
            answer[i] = answer[i].replace("2", "1").replace("1", "#").replace("0", " ");
        }
        return answer;
    }
}