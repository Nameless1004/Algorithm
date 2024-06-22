class Solution {
    public String solution(String s) {
        String answer = "";
        
        int len = s.length();
        boolean isOdd = s.length() % 2 == 0 ? false:true;
        
        if(isOdd){
            answer= s.substring(len / 2, len / 2 + 1);
        }
        else{
            answer= s.substring(len/2-1,len/2 + 1);
        }
        return answer;
    }
}