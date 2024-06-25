class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        // a: 콜라를 받기 위해 마트에 주어야 하는 병 수
        // b: 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수
        // n: 상빈이가 가지고 있는 빈 병의 개수
        
        // n이 a개 미만이면 빈병을 받을 수 없다.
        while(n >= a){
            int tmp = ((n+b) / a);
            n -= tmp * a;
           n = n + tmp*b;
           answer+=tmp * b;
        }
        return answer;
    }
}