class Solution {
    public int solution(int num) {
        int answer = 0;
        long input = num;
        while(input != 1){
            if(answer > 500) return -1;
            
            if(input % 2 == 0) input /= 2;
            else input = input * 3 + 1;
            answer++;
        }
        return answer;
    }
}