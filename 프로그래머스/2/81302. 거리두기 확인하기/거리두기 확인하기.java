import java.util.*;

class Solution {
 public int[] solution(String[][] places) {
         int[] answer = new int[places.length];

        for(int i = 0; i < places.length; i++) {
            ArrayList<ArrayList<Integer>> pos = new ArrayList();
            String[] c = places[i];
            for(int j = 0; j < c.length; j++) {
                for(int k = 0; k < c[j].length(); k++) {
                    if(c[j].charAt(k) == 'P'){
                        pos.add(new ArrayList());
                        pos.get(pos.size() - 1).add(k); // x
                        pos.get(pos.size() - 1).add(j); // y
                    }
                }
            }

            answer[i] = getResult(places, i, pos);
        }

        return answer;
    }
     
    public int getDist(int x, int xx, int y, int yy){
        return Math.abs(x-xx) + Math.abs(y-yy);
    }
    
   public int getResult(String[][] places, int curI, ArrayList<ArrayList<Integer>> pos){
                for(int index = 0; index < pos.size(); index++) {
            int curX = pos.get(index).get(0);
            int curY = pos.get(index).get(1);
            for(int next = 0; next < pos.size(); next++) {
               if(next==index) continue;
                int nextX = pos.get(next).get(0);
                int nextY = pos.get(next).get(1);
                int dist = getDist(curX, nextX, curY, nextY);

                if(dist <= 2){
                    if(dist == 1) return 0;
                    int minX = Math.min(curX, nextX);
                    int minY = Math.min(curY, nextY);
                    int maxX = Math.max(curX, nextX);
                    int maxY = Math.max(curY, nextY);

                    for(int startX = minX; startX <= maxX; startX++) {
                        for(int startY = minY; startY <= maxY; startY++) {
                            if(places[curI][startY].charAt(startX) == 'O'){
                               return 0;
                            }
                        }
                    }

                    for(int startY = minY; startY <= maxY; startY++) {
                        for(int startX = minX; startX <= maxX; startX++) {
                            if(places[curI][startY].charAt(startX) == 'O'){
                                return 0;
                            }
                        }
                    }
                }
            }
        }

        return 1;
    }
    
}