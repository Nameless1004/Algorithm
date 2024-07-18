import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 1; i <= number; ++i){
            answer+=  getFactorCount(i, limit, power);;
        }
        return answer;
    }

    public int getFactorCount(int n, int limit, int p) {
        int count = 0;
        for(int i = 1; i <= Math.sqrt(n); ++i){
            if(i*i == n){
                count++;
                if(count > limit) return p;
            }
            else if (n%i==0){
                count += 2;
                if(count > limit) return p;
            }
        }
        return count;
    }
}