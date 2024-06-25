import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
       List<Integer> list = new ArrayList<>();
        int l = 0;
        int r = numbers.length - 1;
        while(l <= r){
            int p = l + 1;
            for(; p <= r; ++p){
                int sum = numbers[p] + numbers[l];
                if(!list.contains(sum)){
                    list.add(sum);
                }
            }
            l++;
        }
        var result = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(result);
       return result;
    }
}