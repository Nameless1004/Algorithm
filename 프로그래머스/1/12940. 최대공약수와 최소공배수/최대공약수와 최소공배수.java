class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int gcf = 0; // 최대 공약수
        int lcm = -1; // 최소 공배수
        
        int num = 1;
        while(num < m || num < n){
            if(n % num == 0 && m % num == 0){
                if(gcf < num){
                    gcf = num;
                }
            }
            num++;
        }
        
        int left = n < m ? n : m;
        int right = left == n ? m : n;
        int l = left;
        int r = right;
        int cnt = 0;
        while(true){
            if(l==r) {
                lcm = l;
                break;
            }
            
            if(l < r){
                l += left;
            }
             else if(l > r){
                r += right;
            }
        }
        return new int[]{gcf, lcm};
    }
}