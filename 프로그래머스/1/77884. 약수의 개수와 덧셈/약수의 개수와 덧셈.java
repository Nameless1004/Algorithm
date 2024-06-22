import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; ++i){
            var isOdd = isFactorCountOdd(i);
            int sign = 1;
            if(isOdd) sign = -1;
            answer += (sign * i);
        }
        return answer;
    }
    
    public boolean isFactorCountOdd(int n){
        int cnt = 0;
         for(int i = 1; i <= n; ++i){
             if(n%i == 0) cnt++;
         }
        return cnt % 2==0? false: true;
    }
}