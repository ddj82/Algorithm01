import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftPos = 10;
        int rightPos = 12;

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                answer += "L";
                leftPos = num;
            } else if (num == 3 || num == 6 || num == 9) {
                answer += "R";
                rightPos = num;
            } else {
                if (num == 0) num = 11;

                int fromRow = (leftPos - 1) / 3;
                int fromCol = (leftPos - 1) % 3;
                int toRow = (num - 1) / 3;
                int toCol = (num - 1) % 3;

                int leftDist = Math.abs(fromRow - toRow) + Math.abs(fromCol - toCol);

                fromRow = (rightPos - 1) / 3;
                fromCol = (rightPos - 1) % 3;

                int rightDist = Math.abs(fromRow - toRow) + Math.abs(fromCol - toCol);


                if (leftDist < rightDist) {
                    answer += "L";
                    leftPos = num;
                } else if (leftDist > rightDist) {
                    answer += "R";
                    rightPos = num;
                } else {
                    if (hand.equals("left")) {
                        answer += "L";
                        leftPos = num;
                    } else {
                        answer += "R";
                        rightPos = num;
                    }
                }
            }
        }
        return answer;
    }
}