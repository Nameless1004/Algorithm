class Solution {
       boolean[] check;
     int count=0;
     int answer = 0;
    public  int solution(int k, int[][] dungeons) {
        check = new boolean[dungeons.length];

        for(int i = 0; i < dungeons.length; ++i){
            System.out.println("----");
            solve(dungeons, i, k);
            System.out.println("----");
            count = 0;
        }

        return answer;
    }

    private  void solve(int[][] dungeons, int current, int k)
    {
        if(k <= 0) return;

        int d = dungeons.length;
        check[current] = true;

        if(dungeons[current][0] > k) return;
        k -= dungeons[current][1];
        count++;
        answer = Math.max(count, answer);
        for(int i = 0; i < d; ++i){
            if(check[i]) continue;
            if(dungeons[i][0] > k) continue;


            solve(dungeons, i, k);
        }
        count--;
        check[current] = false;
    }
}