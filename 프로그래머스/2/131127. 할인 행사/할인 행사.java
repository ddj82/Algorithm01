import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        List<String> wantList = new ArrayList<>();
        
        for (int i = 0; i < want.length; i++) {
            String s = want[i];
            for (int j = 1; j <= number[i]; j++) {
                wantList.add(s);
            }
        }
        
        Collections.sort(wantList);

        for (int i = 0; i <= discount.length - 10; i++) {
            List<String> discountList = new ArrayList<>();
            for (int j = i; j < i + 10; j++) {
                discountList.add(discount[j]);
            }
            Collections.sort(discountList);

            if (wantList.equals(discountList)) {
                answer++;
            }
        }
        
        return answer;
    }
}