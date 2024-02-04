class Solution {
    public int solution(int price) {
        int answer = 0;
        double a = price * 0.05;
        double b = (int) (price * 0.1);
        double c = (int) (price * 0.2);
        if (price >= 100000 && price < 300000) {
            answer = (int) (price - a);
        } else if (price >= 300000 && price < 500000) {
            answer = (int) (price - b);
        } else if (price >= 500000) {
            answer = (int) (price - c);
        } else {
            answer = price;
        }
        
        return answer;
    }
}