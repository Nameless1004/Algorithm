import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = -1;
        var str = s;
        for(int i = 0; i < s.length(); ++i){
            if(Check(str)){
                answer++;
            }
            str = shift(str);
        }
        return answer == -1 ? 0 : answer + 1;
    }
    public boolean Check(String str){
        Stack<Character> open = new Stack<>();
        char[] arr = str.toCharArray();
        for(var i : arr)
        {
            switch(i)
            {
                case '(':
                case '[':
                case '{':
                    open.push(i);
                    break;
                default:
                    if(open.isEmpty()) return false;

                    var peek = open.peek();
                    if(peek == '(' && i != ')') return false;
                    else if(peek == '[' && i != ']') return false;
                    else if(peek == '{' && i != '}') return false;
                    else open.pop();
                    break;
            }

        }

        if(!open.isEmpty()) return false;
        return true;
    }

    public String shift(String str){
        var tmp = str.substring(1, str.length());
        return tmp + str.charAt(0);
    }
}