import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
         int answer = 0;
        int length = tangerine.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < length; i++)
        {
            int add = tangerine[i];
            if(map.isEmpty() ) { map.put(add, 1); continue; }
            if (map.containsKey(add))
            {
                map.replace(add, map.get(add) + 1);
                continue;
            }

            map.put(add, 1);
        }

        int sum = 0;
        var values = map.values().stream().sorted((x,y)-> -x.compareTo(y)).mapToInt(Integer::intValue).toArray();

        for(var i : values)
        {
            sum += i;
            answer++;
            if(sum >= k) break;
        }
        return answer;
    }
}