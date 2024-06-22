import java.util.*;

class Solution {
    public long solution(long n) {
        var answer = Long.toString(n).toCharArray();
        Arrays.sort(answer);
        var sb = new StringBuilder();
        for(int i = answer.length - 1; i >= 0; --i){
          sb.append(answer[i]);
        }
        return Long.parseLong(sb.toString());
    }
}