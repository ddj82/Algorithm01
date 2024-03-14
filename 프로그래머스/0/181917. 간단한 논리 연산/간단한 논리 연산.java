class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean x = x1 || x2;
        boolean y = x3 || x4;
        answer = x && y;
        return answer;
    }
}