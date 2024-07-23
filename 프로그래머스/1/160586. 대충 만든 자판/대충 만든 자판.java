import java.util.*;

class Solution {
    Map<Character, Integer> mem = new HashMap<Character, Integer>();
    
    public int[] solution(String[] keymap, String[] targets) {
        ArrayList<Integer> l = new ArrayList<>();
        for(var  target  :  targets){
            var charArr  = target.toCharArray();
            int result =  0;
            for(var character :charArr){
                int find =findIndex(keymap, character);
                if(find  ==  -1){
                    result = -1;
                    break;
                }
                result += find;
            }
            l.add(result);
        }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private int findIndex(String[] keymap,  char c){
        if(mem.containsKey(c)){
            return mem.get(c);
        }

        int min  = Integer.MAX_VALUE;
        for(var key : keymap){
          var minIndex  = key.indexOf(c);
          if(minIndex != -1 && min > minIndex){
              min = minIndex;
          }
        }
        if(min == Integer.MAX_VALUE) return -1;

        min += 1;
        mem.put(c,min);
        return min;
    }
}