import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        Stack<Integer> s = new Stack<Integer>();

        int t = 0;
        while(n != 0)
        {
            s.push(n % 3);
            n /= 3;
        }

        int pow = 0;
        while(s.size() != 0){
            int p = s.pop();
            int pp = (int)Math.pow(3, pow);
            if(p != 0){
                answer += pp * p;
            }
            pow++;

        }
        return answer;
    }
}