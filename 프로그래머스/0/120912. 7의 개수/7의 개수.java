class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String s = "7";
        for (int i = 0; i < array.length; i++) {
            String s1 = Integer.toString(array[i]);
            String[] s2 = s1.split("");
            for (int j = 0; j < s2.length; j++) {
                if (s2[j].contains(s)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}