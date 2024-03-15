import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> a = new ArrayList<>();
        switch (n) {
            case 1: {
                for (int i = 0; i < slicer[1] + 1; i++) {
                    a.add(num_list[i]);
                }
                break;
            } 
            case 2: {
                for (int i = slicer[0]; i < num_list.length; i++) {
                    a.add(num_list[i]);
                }
                break;
            }
            case 3: {
                for (int i = slicer[0]; i < slicer[1] + 1; i++) {
                    a.add(num_list[i]);
                }
                break;
            }
            case 4: {
                for (int i = slicer[0]; i < slicer[1] + 1; i++) {
                    a.add(num_list[i]);
                }
                List<Integer> b = new ArrayList<>();
                if (slicer[2] == 2) {
                    for (int i = 0; i < a.size(); i++) {
                        if (i % 2 == 0) {
                            b.add(a.get(i));
                        }
                    }
                } else if (slicer[2] == 3) {
                    for (int i = 0; i < a.size(); i++) {
                        if (i % 3 == 0) {
                            b.add(a.get(i));
                        }
                    }
                }
                a = b;
                break;
            }
        }
        int[] answer = a.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}