using System;

public class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        var l = date1[0].ToString() + date1[1].ToString() + date1[2].ToString();
        var r = date2[0].ToString() + date2[1].ToString() + date2[2].ToString();
        return int.Parse(l) < int.Parse(r) ? 1 : 0;

    }
}
// 1 4 3 date1
// 1 3 2 date2