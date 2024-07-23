import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer =0;
        if(score.length <= m) return answer;
        Arrays.sort(score);
        int i =  score.length - 1;
        while(true){
            int min = score[i - m + 1];
            answer +=  min * m;
            i  -= m;
            if(i - m + 1 < 0) break;
        }

        return answer;
    }
}