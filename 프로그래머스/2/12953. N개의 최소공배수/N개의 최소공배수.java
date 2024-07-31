class Solution {
    public int solution(int[] arr) {
        for(int i = 1; i < 100000000; ++i){
            boolean lcm = true;
            for(int j : arr){
                if(i % j != 0){
                    lcm = false;
                    break;
                }
            }
            if(lcm == true){
                return i;
            }
        }
        return 0;
    }
}