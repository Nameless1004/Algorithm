import java.util.*;
class Solution {

    public int solution(int n, int k) {
        int answer =0;
        String c = Integer.toString(n, k);
        String[] split = c.split("0");
        for (String s : split) {
            if(s.isEmpty())continue;
            if(isPrime(Long.parseLong(s))) answer++;
        }
        return answer;
    }


    private boolean isPrime(long n){
        if(n < 2) return false;
        for(long i = 2; i*i <= n; ++i){
            if(n % i == 0) return false;
        }

        return true;
    }
}