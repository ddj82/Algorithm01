class Solution {
    public int solution(String number) {
        int answer = 0;
        String s = "";
        int a = 0;
        for (int i = 0; i < number.length(); i++) {
            s += number.charAt(i);
            a += Integer.parseInt(s);
            s = "";
        }
        answer = a % 9;
        return answer;
    }
}