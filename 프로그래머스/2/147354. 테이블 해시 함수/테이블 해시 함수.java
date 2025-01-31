import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int compare = Integer.compare(o1[col - 1], o2[col - 1]);
                return compare == 0 ? -Integer.compare(o1[0], o2[0]) : compare;
            }
        });

        for(int i = row_begin - 1; i <= row_end - 1; i++) {
            
            int s = 0;
            for(int j = 0; j < data[0].length; ++j){
                s += data[i][j] % (i + 1);
            }
            answer = answer ^ s;
        }
        
        return answer;
    }
}