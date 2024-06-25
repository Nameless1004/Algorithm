import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        int commandCount = commands.length;
        for(int i = 0 ; i < commandCount ; i++){
            var start = commands[i][0];
            var end = commands[i][1];
            var select = commands[i][2];
            var copy = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(copy);
            list.add(copy[select - 1]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}