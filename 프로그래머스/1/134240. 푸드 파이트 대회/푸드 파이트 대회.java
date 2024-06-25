import java.text.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; ++i){
            int c = food[i] / 2;

            if( c >= 1 ){
                for(int cnt = 0; cnt < c; ++cnt){
                    answer += MessageFormat.format("{0}",i);
                }

            }
        }

        answer+="0";
        for(int i = answer.length() -2; i >= 0; --i) answer += answer.charAt(i);
        return answer;
    }
}