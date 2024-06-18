class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String s1 = s.toLowerCase();
        int p = 0;
        int y = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'p') {
                p++;
            } else if (s1.charAt(i) == 'y') {
                y++;
            }
        }
        if (p != y) {
            answer = false;
        }
        return answer;
    }
}