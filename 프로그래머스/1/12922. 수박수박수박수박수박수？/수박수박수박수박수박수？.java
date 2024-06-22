class Solution {
    public String solution(int n) {
        String[] soobak = {"수","박"};
        String answer = "";
        for(int i = 0; i < n; ++i)
        {
            answer += soobak[i%2];
        }
        return answer;
    }
}