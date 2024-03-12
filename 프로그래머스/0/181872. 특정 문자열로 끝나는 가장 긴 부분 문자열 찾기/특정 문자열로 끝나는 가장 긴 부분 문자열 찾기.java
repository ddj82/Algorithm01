class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        String pat2 = "";
        if (pat.length() == 1) {
            pat2 = pat;
        } else {
            pat2 += pat.charAt(pat.length() - 1);
        }
        int s = myString.lastIndexOf(pat2);
        answer = myString.substring(0, s + 1);
        return answer;
    }
}