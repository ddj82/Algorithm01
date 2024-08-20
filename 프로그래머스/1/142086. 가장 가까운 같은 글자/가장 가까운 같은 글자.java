class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            String s2 = s.charAt(i) + "";
            if (s1.contains(s2)) {
                for (int j = i - 1; j >= 0; j--) {
                    String s3 = s.charAt(j) + "";
                    if (s3.equals(s2)) {
                        answer[i] = i - j;
                        break;
                    }
                }
            } else {
                s1 += s2;
                answer[i] = -1;
            }
        }
        return answer;
    }
}