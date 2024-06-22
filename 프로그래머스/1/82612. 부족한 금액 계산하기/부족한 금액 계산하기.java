class Solution {
    public long solution(int price, int money, int count) {
        long answer = sum(count, price, 1) - money;
        
        return answer <= 0 ? 0 : answer;
    }
    
    public long sum(int cnt, int price, int n){
        if(n > cnt) return 0;
        return price * n + sum(cnt, price, n + 1);
    }
}