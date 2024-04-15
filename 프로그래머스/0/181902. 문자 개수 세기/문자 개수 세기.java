class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (my_string.charAt(i) == s.charAt(j)) {
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}