import java.util.*;

class Solution {
    public int[] solution(long n) {
        var str = Long.toString(n);
        var answer = new ArrayList<Integer>();
        for(int i = str.length() - 1; i >= 0; --i){
            answer.add(Integer.parseInt( str.substring(i, i + 1) ));
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}