class Solution {
    public String solution(String my_string) {
        String answer = "";
        String q = "aeiou";
        StringBuffer s1 = new StringBuffer(my_string);
        
        for (int i = 0; i < q.length(); i++) {
            for (int j = 0; j < my_string.length(); j++) {
                if (q.charAt(i) == my_string.charAt(j)) {
                    my_string = String.valueOf(s1.deleteCharAt(j));
                    j--;
            }
        }
        }
        answer = my_string;
            
        return answer;
    }
}