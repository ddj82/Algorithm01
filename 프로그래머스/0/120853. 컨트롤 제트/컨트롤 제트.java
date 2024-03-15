class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] s1 = s.split(" ");
        int z = 0;
        for (int i = 0; i < s1.length; i++) {
            if (!(s1[i].equals("Z"))) {
                z = Integer.parseInt(s1[i]);
                answer += z;
            } else {
                answer -= z;
            }
        }
        return answer;
    }
}