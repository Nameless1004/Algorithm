using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(int[] arr) {
        List<int> answer = new List<int>();
        for(int i = 0; i < arr.Length;){
            int lastIndex = answer.Count - 1;
            
            if(answer.Count == 0){
                answer.Add(arr[i++]);
            }
            else if(answer[lastIndex] == arr[i]){
                answer.RemoveAt(lastIndex);
                i++;
            }
            else{
                answer.Add(arr[i++]);
            }
        }
        
        if(answer.Count == 0) return new int[]{-1};
        return answer.ToArray();
    }
}