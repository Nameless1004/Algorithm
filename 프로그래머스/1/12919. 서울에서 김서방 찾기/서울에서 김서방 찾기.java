import java.text.MessageFormat;
import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        return MessageFormat.format("김서방은 {0}에 있다", Arrays.asList(seoul).indexOf("Kim"));
    }
}