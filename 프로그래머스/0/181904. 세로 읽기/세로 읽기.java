class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[][] ch = new char[(my_string.length() / m)][m];
        int idx = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < m; j++) {
                ch[i][j] = my_string.charAt(idx);
                idx++;
                if (j == (c - 1)) {
                    answer += ch[i][j];
                }
            }
        }
        return answer;
    }
}