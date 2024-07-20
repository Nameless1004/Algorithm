import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int max = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i = 0; i < lost.length; ++i){
            for(int j = 0; j < reserve.length; ++j){
                if(lost[i] == reserve[j]){
                    max++;
                    lost[i]=0;
                    reserve[j]=0;
                    break;
                }
            }
        }
        for(var i : lost){
            if(i == 0) continue;
            for(int j = 0; j < reserve.length; ++j){
                if(reserve[j] == 0) continue;

                int prev = i - 1;
                int next = i + 1;
                if(prev == reserve[j] || next == reserve[j]){
                    max++;
                    reserve[j] = 0;
                    break;
                }
            }
        }

        return max;
    }
    
}