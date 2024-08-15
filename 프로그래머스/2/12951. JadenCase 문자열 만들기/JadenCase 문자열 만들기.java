class Solution {
    public String solution(String s) {
        String answer = "";
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1[i].length(); j++) {
                if (s1[i].charAt(j) == ' ') {
                    continue;
                } else {
                    if (Character.isDigit(s1[i].charAt(j))) {
                        s1[i] = s1[i].toLowerCase();
                        break;
                    } else {
                        String upper = s1[i].substring(0, j + 1).toUpperCase();
                        String lower = s1[i].substring(j + 1).toLowerCase();
                        s1[i] = upper + lower;
                        break;
                    }
                }
            }
            
            answer += s1[i] + " ";
        }
        if(!(s.substring(s.length() - 1, s.length()).equals(" "))) {
            answer = answer.trim();
        }
        return answer;
    }
}