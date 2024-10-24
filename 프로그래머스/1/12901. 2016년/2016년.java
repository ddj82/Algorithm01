import java.time.*;
import java.time.format.*;
import java.util.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate date = LocalDate.of(2016, a, b);
        answer = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("US")).toUpperCase();
        return answer;
    }
}