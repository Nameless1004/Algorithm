class Solution {
    public long solution(int n) {
        int[] mem = new int[n+2];
        mem[0] = 0;
        mem[1] = 1;
        mem[2] = 2;
        for(int i = 3; i <= n; ++i){
            mem[i] = (mem[i - 1] + mem[i-2]) % 1234567;
        }
        return mem[n];
    }

}