using System;
using System.Linq;
public class Solution {
    public int[] solution(int[] num_list) {
        Array.Sort(num_list);
        
        return num_list.ToList().Skip(5).Take(num_list.Length - 5).ToArray();
    }
}