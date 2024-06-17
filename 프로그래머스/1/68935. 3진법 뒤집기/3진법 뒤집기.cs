using System;
using System.Collections.Generic;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        Stack<int> s = new Stack<int>();
        
        int t = 0;
        while(n != 0)
        {
            s.Push(n % 3);
            n /= 3;
        }
        
        int pow = 0;
        while(s.Count != 0){
            int p = s.Pop();
            int pp = (int)Math.Pow(3, pow);
            if(p != 0){
                answer += pp * p;
            }    
            pow++;
        
        }
        return answer;
    }
}