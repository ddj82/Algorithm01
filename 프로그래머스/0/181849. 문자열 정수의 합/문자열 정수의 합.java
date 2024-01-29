class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String a = "";
        for (int i = 0; i < num_str.length(); i++) {
        a += num_str.charAt(i);
        answer += Integer.parseInt(a);
        a = "";
        }
        
        return answer;
    }
}