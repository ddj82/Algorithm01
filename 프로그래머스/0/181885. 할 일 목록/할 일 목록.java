import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> a = new ArrayList<>();
        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                a.add(todo_list[i]);
            }
        }
        return a.stream().toArray(String[]::new);
    }
}