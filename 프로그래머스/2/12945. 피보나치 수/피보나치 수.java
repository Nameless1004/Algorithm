class Solution {
    public int solution(int n) {
        var a = 0;
        var b = 1;
        var sum = 1;
        for(int i = 2; i <= n; i++)
        {
            sum = (a + b) % 1234567;
            a = b;
            b = sum;
        }

        return sum;
    }
}