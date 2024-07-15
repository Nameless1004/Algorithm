class Solution {
    public int solution(int[] nums) {
        int p0 = 0;
        int p1 = p0+1;
        int p2 = p1+1;
        int answer = 0;
        while(p0 <= nums.length - 3){
            int sum = nums[p0] + nums[p1] + nums[p2];
            if(isPrime(sum)){
                answer++;
            }
            
            p2++;
            if(p2 >= nums.length){
                p1++;
                p2 = p1+1;
                
                if(p1 >= nums.length - 1){
                    p0++;
                    p1 = p0 + 1;
                    p2 = p1+1;
                }
            }
        }
        return answer;
    }
    
    private boolean isPrime(int n){
        if(n < 2) return false;
        int l = (int)Math.sqrt(n);
        for(int i = 2; i <= l; ++i){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}