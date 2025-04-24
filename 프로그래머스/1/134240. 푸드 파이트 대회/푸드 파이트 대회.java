class Solution {
    public String solution(int[] food) {
        String answer = "";
        String a = "";
        String b = a;
        String b1 = "";
        for (int i = 1; i < food.length; i++) {
            for (int j = 1; j <= food[i]/2; j++) {
                a += i + "";
            }
        }
        b = a;
        a += "0";
        for (int i = b.length() - 1; i >= 0; i--) {
            b1 += b.charAt(i) + "";
        }
        
        answer = a + b1;
        return answer;
    }
}