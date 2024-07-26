class Solution {
    public int[] solution(String[] wallpaper) {
        int minX;
        int maxX;
        int minY;
        int maxY;

        minX = minY = Integer.MAX_VALUE;
        maxX = maxY = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            char[] row = wallpaper[i].toCharArray();
            for (int j = 0; j < row.length; j++) {
                if(row[j] == '#') {
                    minX = Math.min(minX, j);
                    minY = Math.min(minY, i);
                    maxX = Math.max(maxX, j+1);
                    maxY = Math.max(maxY, i + 1);
                }
            }
        }
        int[] answer = {minY, minX, maxY, maxX};
        return answer;
    }
}