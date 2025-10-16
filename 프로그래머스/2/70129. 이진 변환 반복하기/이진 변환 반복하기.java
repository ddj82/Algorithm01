class Solution {
    public int[] solution(String s) {
        int index = 0;
        int z = 0;

        while (!(s.equals("1"))) {
            String zero =  s.replace("1", "");
            s = s.replace("0", "");
            s = Integer.toBinaryString(s.length());
            index++;
            z += zero.length();
        }
        
        int[] answer = {index, z};
        return answer;
    }
}