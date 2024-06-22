class Solution {
    public long solution(long n) {
        long result = (long)Math.pow((long)Math.sqrt(n), 2);
        
        return result == n ? (long)Math.pow((long)Math.sqrt(result) + 1 , 2) : -1;
    }
}