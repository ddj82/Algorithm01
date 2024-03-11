import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                a.add(i);
                b.add(rank[i]);
            }
        }
        int[] b2 = b.stream().mapToInt(i -> i).toArray();
        Arrays.sort(b2);
        for (int i = 0; i < rank.length; i++) {
            if (rank[i] == b2[0]) {
                answer += i * 10000;
            } else if (rank[i] == b2[1]) {
                answer += i * 100;
            } else if (rank[i] == b2[2]) {
                answer += i;
            }
        }
        
        return answer;
    }
}