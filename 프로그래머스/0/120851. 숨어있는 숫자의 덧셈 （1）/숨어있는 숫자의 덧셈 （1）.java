class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] a = new char[1];
        String s = "";
        for (int i = 0; i < my_string.length(); i++) {
            a[0] = my_string.charAt(i);
            if (Character.isDigit(a[0])) {
                s += a[0];
                answer += Integer.parseInt(s);
                s = "";
        }
    }
        return answer;
    }
}