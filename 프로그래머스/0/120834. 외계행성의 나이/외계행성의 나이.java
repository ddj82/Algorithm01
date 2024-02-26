class Solution {
    public String solution(int age) {
        String answer = Integer.toString(age);
        String[] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        for (int i = 0; i < a.length; i++) {
            String s = Integer.toString(i);
            answer = answer.replaceAll(s, a[i]);
        }
        return answer;
    }
}