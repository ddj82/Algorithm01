import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        a:
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) {
                    if (list.size() == 0) {
                        list.add(board[i][move - 1]);
                    } else if (list.get(list.size() - 1) == board[i][move - 1]) {
                        list.remove(list.size() - 1);
                        answer += 2;
                    } else {
                        list.add(board[i][move - 1]);
                    }
                    board[i][move - 1] = 0;
                    continue a;
                }
            }
        }
        return answer;
    }
}