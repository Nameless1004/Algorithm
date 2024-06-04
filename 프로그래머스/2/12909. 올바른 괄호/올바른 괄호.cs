using System;
using System.Collections.Generic;

public class Solution {
    public bool solution(string s) {
        bool answer = true;
        Stack<char> stack = new Stack<char>();
        
        foreach(var i in s){
            if(i == '('){
                stack.Push(i);
                continue;
            }
            
            if(stack.Count == 0) return false;
            var peek = stack.Peek();
            if(peek == '('){
                stack.Pop();   
            }
        }
        
        if(stack.Count != 0) return false;
        return true;
    }
}