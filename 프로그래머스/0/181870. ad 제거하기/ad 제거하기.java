import java.util.*;
class Solution {
    public List<String> solution(String[] strArr) {
        List<String> s = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            if (!(strArr[i].contains("ad"))) {
                s.add(strArr[i]);
            }
        }
        return s;
    }
}