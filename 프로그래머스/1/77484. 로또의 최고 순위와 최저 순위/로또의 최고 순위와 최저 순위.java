class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        boolean[] lut = new boolean[46];
        int[] rank = {6,6,5,4,3,2,1};
        int high = 0;
        for(int i = 0; i < win_nums.length; ++i){
            lut[win_nums[i]] = true;
        }
        
        int cnt = 0;
        int unknown = 0;
        for(int i = 0; i < lottos.length; ++i){
            if(lottos[i] == 0 ) {
                unknown++;
                continue;
            }
            
            if( lut[lottos[i]] == true) cnt++;
        }

        high = rank[Math.min(cnt + unknown, 6)];
        int[] answer = {high,  rank[cnt]};
        return answer;
    }
}