import java.util.*;

class Solution {
    public int[] solution(String s) {
       Map<Character, Integer> result = new HashMap<>();
        List<Integer> l = new ArrayList<>();

        for(int i = 0; i < s.length(); ++i)
        {
            int val = 0;
            if (result.containsKey(s.charAt(i)))
            {
                var v = result.get(s.charAt(i));
                result.replace(s.charAt(i),  i);
                l.add(i-v);
            }
            else
            {
                result.put(s.charAt(i), i);
                l.add(-1);
            }

        }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}