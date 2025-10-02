import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        String[][] recordArr = new String[record.length][];
        
        for (int i = 0; i < record.length; i++) {
            recordArr[i] = record[i].split(" ");
        }
        
        Map<String, String> nickNameMap = new HashMap<>();
        
        for (String[] strings : recordArr) {
            if (strings[0].equals("Enter") || strings[0].equals("Change")) {
                nickNameMap.put(strings[1], strings[2]);
            }
        }
        
        for (String[] strings : recordArr) {
            if (nickNameMap.containsKey(strings[1])) {
                if (strings[0].equals("Enter")) {
                    strings[2] = nickNameMap.get(strings[1]);
                }
            }
        }
        
        List<String> recordList = new ArrayList<>();
        
        for (int i = 0; i < recordArr.length; i++) {
            String[] s = recordArr[i];
            if (s[0].equals("Enter")) {
                recordList.add(nickNameMap.get(s[1]) + "님이 들어왔습니다.");
            } else if (s[0].equals("Leave")) {
                recordList.add(nickNameMap.get(s[1]) + "님이 나갔습니다.");
            }
        }
        
        
        String[] answer = new String[recordList.size()];
        
        for (int i = 0; i < recordList.size(); i++) {
            answer[i] = recordList.get(i);
        }
        
        return answer;
    }
}