import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> map = new HashMap<>();
        int answer = 0;
        for (String w : want){
            map.put(w, 0);
        }
        for(int curDay = 0; curDay + 9 < discount.length; ++curDay){
            int last = curDay + 9;
            for (String w : want){
                map.replace(w, 0);
            }
            for(int i = curDay; i <= last; i++) {
                if(map.containsKey(discount[i])){
                    map.replace(discount[i], map.get(discount[i]) + 1);
                }
            }
            boolean check = true;
            for(int i = 0; i < want.length; i++) {
                if(map.get(want[i]) != number[i]){
                    check = false;
                    break;
                }
            }
            if(check) answer++;
        }

        return answer;
    }
}