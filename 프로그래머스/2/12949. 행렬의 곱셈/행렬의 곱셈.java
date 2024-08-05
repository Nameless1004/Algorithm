class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int y = 0; y < arr1.length; ++y){
            for(int x = 0; x < arr2[0].length; ++x){
                int sum = 0;
               
                for(int xx = 0; xx < arr2.length; ++xx){
                    sum += arr1[y][xx] * arr2[xx][x];
                }
                answer[y][x] = sum;
            }
        }
        return answer;
    }
}