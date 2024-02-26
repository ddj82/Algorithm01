class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String n = Integer.toString(num);
        String n1 = Integer.toString(k);
        if (n.indexOf(n1) != -1) {
            answer = n.indexOf(n1) + 1;
        } else {
            answer = -1;
        }
        return answer;
    }
}