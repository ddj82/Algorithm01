class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int c = 0;
        if (myString.indexOf(pat, c) >= 0) {
        	c = myString.indexOf(pat, c);
        	answer++;
            for (int i = c; i < myString.length(); i++) {
        		if (myString.indexOf(pat, i) > c) {
        			answer++;
        		}
        		c = myString.indexOf(pat, i);
        	}
        }
        return answer;
    }
}