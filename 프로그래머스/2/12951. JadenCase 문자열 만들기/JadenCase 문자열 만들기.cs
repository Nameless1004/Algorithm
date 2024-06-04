public class Solution {
    public string solution(string s) {
        string answer = "";
        string prev = "";
        
        foreach(var i in s){
            if(answer.Length == 0){
                answer += i.ToString().ToUpper();
            }
            else if(prev == " "){
                answer += i.ToString().ToUpper();
            }
            else {
                answer += i.ToString().ToLower();
            }
            
            prev = i.ToString();
        }
        return answer;
    }
}