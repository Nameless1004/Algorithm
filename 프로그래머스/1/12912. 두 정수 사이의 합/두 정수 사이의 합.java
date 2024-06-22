class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a==b) return a;
        long l = a < b ? a : b;
        long r = a < b ? b : a;
        for(long i = l; i <= r; ++i)
            answer+=i;
        return answer;
    }
}