import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int number_power = 0;

        for (int j = 1; j <= number; j++) {

            List<Integer> list = new ArrayList<>();

            for (int i = 1; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    list.add(i);
                    if (i != j / i) {
                        list.add(j / i);
                    }
                }
            }
            Collections.sort(list);
            number_power = list.size();

            if (limit < list.size()) {
                number_power = power;
            }
            answer += number_power;
        }
        return answer;
    }
}