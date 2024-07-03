import java.util.ArrayList;

class Solution {
    public int[] solution(int k, int[] score) {
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        ArrayList<Integer> candiates = new ArrayList<Integer>();
        
        for(int i = 0; i < score.length; ++i){
            var s = score[i];
            if(i <= k - 1){
                candiates.add(s);
                candiates.sort(Integer::compareTo);
                answer.add(candiates.get(0));
            }
            else{
                if(candiates.get(0) <= s){
                    candiates.remove(0);
                    candiates.add(s);
                    candiates.sort(Integer::compareTo);
                }
                answer.add(candiates.get(0));
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}