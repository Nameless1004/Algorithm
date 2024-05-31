using System;
using System.Linq;

public class Solution {
    public string[] solution(string myStr) {
        var answer = myStr.Split('a', 'b', 'c').Where(x => x!="").ToArray();
        return answer.Length == 0 ? new string[]{"EMPTY"} : answer;
    }
}