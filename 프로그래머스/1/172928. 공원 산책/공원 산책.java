import java.util.*;
class Solution {
     public int[] solution(String[] park, String[] routes) {
        int height = park.length;
        int width = park[0].length();

        int startX =0, startY = 0;
        Character[][] map = new Character[height][width];
        for(int i = 0; i < height; ++i){
            for(int j = 0; j < width; ++j){
                var c = park[i].charAt(j);
                if(c == 'S'){
                    startX = j;
                    startY = i;
                }
                map[i][j] = park[i].charAt(j);
            }
        }



        Map<Character, int[]> dir = new HashMap<>();
        dir.put('N', new int[]{0, -1});
        dir.put('W', new int[]{-1, 0});
        dir.put('E', new int[]{1, 0});
        dir.put('S', new int[]{0, 1});

        for(String op : routes){
            var s = op.split(" ");
            var direction = s[0].charAt(0);
            var dist = Integer.parseInt(s[1]);

            var moveX = dir.get(direction)[0] * dist;
            var moveY = dir.get(direction)[1] * dist;

            int expectedX = startX + moveX;
            int expectedY = startY + moveY;

            if (expectedX < 0 || width <= expectedX ||
                    expectedY < 0 || height <= expectedY) {
                continue;
            }

        
            boolean obstacle = false;
            for(int i = 1; i<= dist; ++i){
                if(map[startY + dir.get(direction)[1] * i][startX + dir.get(direction)[0] * i] == 'X'){
                    obstacle = true;
                    break;
                }
            }

            if(obstacle) continue;

            startX = expectedX;
            startY = expectedY;
        }


        return new int[]{startY, startX};
    }
}