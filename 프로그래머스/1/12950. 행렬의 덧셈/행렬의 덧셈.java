class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int column = arr1[0].length;
        int[][] answer = new int[row][column];

        for(int y = 0; y < row; ++y){
            for(int x = 0; x < column; ++x){
                answer[y][x] = arr1[y][x] + arr2[y][x];
            }
        }
        return answer;
    }
}