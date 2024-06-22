import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> l = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; ++i){
            if(min > arr[i]){
                min = arr[i];
            }    
        }
        
        for(int num : arr){
            if(min != num) l.add(num);
        }
        
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}