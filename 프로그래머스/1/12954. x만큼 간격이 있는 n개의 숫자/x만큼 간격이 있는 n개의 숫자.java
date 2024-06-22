import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        ArrayList<Long> answer = new ArrayList<>();
        for(long i = x; answer.size() < n; i += x){
            answer.add(i);
        }
        return answer.stream().mapToLong(Long::longValue).toArray();
    }
}