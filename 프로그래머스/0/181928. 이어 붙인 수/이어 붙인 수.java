class Solution {
    public int solution(int[] num_list) {
        String s = "";
        String s1 = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                s += String.valueOf(num_list[i]);
            } else {
                s1 += String.valueOf(num_list[i]);
            }
        }
        int answer = Integer.valueOf(s) + Integer.valueOf(s1);
        return answer;
    }
}