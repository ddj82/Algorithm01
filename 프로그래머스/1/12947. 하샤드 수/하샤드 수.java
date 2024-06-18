class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int x1 = x;
        int a = 1;
        if (x1 > 10) {
            a = x % 10;
        }
        while (x1 > 10) {
			x1 /= 10;
			a += x1 % 10;
		}
        if (x % a != 0) {
            answer = false;
        }
        return answer;
    }
}