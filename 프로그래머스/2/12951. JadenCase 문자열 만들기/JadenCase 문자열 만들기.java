class Solution {
    public String solution(String s) {
        String answer = "";
        char prev = ' ';
        char[] arr = s.toCharArray();
        for(char i : arr){
            if(answer.length() == 0){
                answer += String.valueOf(i).toUpperCase();
            }
            else if(prev == ' '){
                answer += String.valueOf(i).toUpperCase();
            }
            else {
                answer += String.valueOf(i).toLowerCase();
            }

            prev = i;
        }
        return answer;
    }
}