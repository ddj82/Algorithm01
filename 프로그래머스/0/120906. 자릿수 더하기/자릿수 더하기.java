class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            r += s.charAt(i);
            answer += Integer.parseInt(r);
            r = "";
        }
        return answer;
    }
}