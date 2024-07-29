import java.util.*;

class Solution {
    public int solution(int[] elements) {
         HashSet<Integer> s = new HashSet<Integer>();
        for(int i = 1; i <= elements.length; ++i){
            for(int k = 0; k < elements.length; ++k){
                var t = k + i;
                var offset = k;
                var sum = 0;
                for(int c = 1; c <= i; ++c)
                {
                    sum += elements[(offset + c) % elements.length];
                }

                s.add(sum);
            }
        }
        return s.size();
    }
}