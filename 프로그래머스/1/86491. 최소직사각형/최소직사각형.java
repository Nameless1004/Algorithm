import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth = Integer.MIN_VALUE;
        int maxHeight = Integer.MIN_VALUE;
        
        for(int i = 0; i < sizes.length; ++i){
            var tmp = sizes[i];
            maxWidth = Integer.max(maxWidth, Integer.min(tmp[1], tmp[0]));
            maxHeight = Integer.max(maxHeight, tmp[1] < tmp[0] ? tmp[0] : tmp[1]);
        }

        return maxHeight * maxWidth;
    }
}