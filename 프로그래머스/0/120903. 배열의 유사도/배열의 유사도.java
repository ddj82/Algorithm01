class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        String[] ss1 = s1.length < s2.length ? s1 : s2;
        String[] ss2 = s1.length < s2.length ? s2 : s1;
            
        for (int i = 0; i < ss1.length; i++) {
            for (int j = 0; j < ss2.length; j++) {
                if (ss1[i].equals(ss2[j])) {
                    answer++;
                }
            }
        }
    
        return answer;
    }
}