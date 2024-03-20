import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int cnt = 0;
        List<Integer> a1 = new ArrayList<>();
        Map<Integer,Integer> b = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            a1.add(strArr[i].length());
        }
        Set<Integer> set = new HashSet<Integer>(a1);
        List<Integer> a = new ArrayList<Integer>(set);
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < strArr.length; j++) {
                if (a.get(i) == strArr[j].length()) {
                    cnt++;
                }
            }
            b.put(a.get(i), cnt);
            cnt = 0;
        }
        int answer = b.get(a.get(0));
        for (int i = 0; i < b.size(); i++) {
            if (answer < b.get(a.get(i))) {
                answer = b.get(a.get(i));
            }
        }
        
        return answer;
    }
}