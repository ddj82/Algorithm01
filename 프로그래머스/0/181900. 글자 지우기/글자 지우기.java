import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int a = 0;
        Arrays.sort(indices);
        for (int i = 0; i < my_string.length(); i++) {
        	if (a < indices.length && indices[a] == i) {
        		System.out.print(" a: " + i);
        		a++;
        	} else {
        		answer += my_string.charAt(i);
        	}	
        }
        return answer;
    }
}