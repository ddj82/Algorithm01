class Solution {
    public String solution(String my_string, String letter) {
        StringBuffer str = new StringBuffer(my_string);
        for (int i = 0; i < my_string.length(); i++) {
        if (my_string.indexOf(letter) == i) {
            my_string = String.valueOf(str.deleteCharAt(i));
            i--;
        }
    }
        String answer = my_string;
        return answer;
    }
}