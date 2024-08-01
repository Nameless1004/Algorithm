import java.util.*;

class Solution {
    public int solution(int[] citations) {
       Arrays.sort(citations);
        HashSet<Integer> set = new HashSet<>();
        int max = citations[citations.length - 1];
        for (int h = max; h >= 0; h--) {
            int quote = h;

            for (int i = 0; i < citations.length; i++) {
                if (quote <= citations[i]) {
                    set.add(i);
                }
            }

            if(set.size() < quote) {
                set.clear();
                continue;
            }

            boolean check = true;
            for (int i = 0; i < citations.length; i++) {
                if (set.contains(i)) continue;
                if(citations[i] > quote){
                    check = false;
                    break;
                }
            }

            if (check) {
                return quote;
            }
            set.clear();
        }
        return 0;
    }
}