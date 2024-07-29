import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> nameToRanking = new HashMap<>();
 
        for(int i = 0; i < players.length; ++i){
            nameToRanking.put(players[i], i);
        }
        
        for(String calling : callings){ 
            int currentIndex = nameToRanking.get(calling);
            int swapIndex = currentIndex - 1;
            nameToRanking.replace(players[currentIndex], nameToRanking.get(players[currentIndex]) - 1);
            nameToRanking.replace(players[swapIndex], nameToRanking.get(players[swapIndex]) + 1);
            
            String tmp = players[currentIndex];
            players[currentIndex] = players[swapIndex];
            players[swapIndex]  = tmp;
        }
        
        return players;
    }
}