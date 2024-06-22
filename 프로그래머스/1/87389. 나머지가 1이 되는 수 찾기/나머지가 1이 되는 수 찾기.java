class Solution {
    public int solution(int n) {
        int x = 1;
        while(n > x++){
            if(n % x == 1) return x;
        }
        return 0;
    }
}