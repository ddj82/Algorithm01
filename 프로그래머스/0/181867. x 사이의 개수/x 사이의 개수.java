class Solution {
    public int[] solution(String myString) {
        if (myString.charAt(myString.length() - 1) == 'x') {
            myString += " x";
        }
        String[] s = myString.split("x");
        int[] answer = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].replaceAll(" ", "");
            answer[i] = s[i].length();
        }
        return answer;
    }
}