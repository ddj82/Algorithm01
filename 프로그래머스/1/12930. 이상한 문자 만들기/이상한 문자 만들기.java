class Solution {
    public String solution(String s) {
        String answer = "";
        String[] s1 = s.split(" ", -1);
        for (int i = 0; i < s1.length; i++) {
            String ss = "";
            for (int j = 0; j < s1[i].length(); j++) {
                if (j == 0) {
                    ss += Character.toUpperCase(s1[i].charAt(j));
                } else {
                    if (j % 2 == 0) {
                        ss += Character.toUpperCase(s1[i].charAt(j));
                    } else {
                        ss += Character.toLowerCase(s1[i].charAt(j));
                    }
                }
            }
            if (i == s1.length - 1) {
                answer += ss;
            } else {
                answer += ss + " ";
            }
        }
        return answer;
    }
}