using System;

public class Solution {
    public int solution(string num_str) {
        
        var answer = 0;
        foreach(var i in num_str){
            answer += int.Parse(i.ToString());
        }
        
        return answer;
    }
}