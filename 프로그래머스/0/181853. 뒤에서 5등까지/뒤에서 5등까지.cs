using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(int[] num_list) {
        Array.Sort(num_list);
        
        var answer = new List<int>();
        for(int i = 0; i < 5; ++i)
        {
            answer.Add(num_list[i]);
        }
        return answer.ToArray();
    }
}