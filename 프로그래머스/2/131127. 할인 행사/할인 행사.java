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
        
        int index = discount.length - 10;
        
        for (int i = 0; i <= discount.length - 10; i++) {
            String[] discountArr = Arrays.copyOfRange(discount, i, discount.length - index);
            index--;

            List<String> discountList = Arrays.asList(discountArr);
            Collections.sort(discountList);

            if (wantList.equals(discountList)) {
                answer++;
            }
        }
        
        return answer;
    }
}