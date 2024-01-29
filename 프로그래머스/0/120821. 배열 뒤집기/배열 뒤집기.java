class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int a;
        int a1 = num_list.length - 1;
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[a1 - i];
        }
        return answer;
    }
}