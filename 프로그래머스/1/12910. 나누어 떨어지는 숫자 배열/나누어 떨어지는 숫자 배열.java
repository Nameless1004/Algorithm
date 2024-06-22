import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i : arr){
            if(i % divisor == 0) l.add(i);
        }
         Collections.sort(l);
        if(l.size() == 0) l.add(-1);

        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}