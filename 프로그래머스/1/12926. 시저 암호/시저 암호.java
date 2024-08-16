class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String[] s1 = s.split("");
        int[] a = new int[s1.length];
        char[] c = new char[s1.length];
        
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].charAt(0) == 32) {
                a[i] = s1[i].charAt(0);
            } else if (s1[i].charAt(0) >= 65 && s1[i].charAt(0) <= 90) {
                if (s1[i].charAt(0) + n > 90) {
                    a[i] = s1[i].charAt(0) + n - 26;
                } else {
                    a[i] = s1[i].charAt(0) + n;
                }
            } else {
                if (s1[i].charAt(0) + n > 122) {
                    a[i] = s1[i].charAt(0) + n - 26;
                } else {
                    a[i] = s1[i].charAt(0) + n;
                }
            }
        }
        
        for (int i = 0; i < s1.length; i++) {
            c[i] = (char) a[i];
            answer += c[i];
        }
        
        return answer;
    }
}