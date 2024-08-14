import java.util.*;

class Solution {
    int answer = 1;
    boolean find = false;
    public int solution(String word) {
        Character[] arr = { 'A', 'E', 'I', 'O', 'U'};
        StringBuilder sb = new StringBuilder();
        makeDict(word, sb, arr, 0);
        return answer;
    }
    
    public void makeDict(String word, StringBuilder sb, Character[] arr, int currentLevel){
       if(currentLevel >= arr.length){
            return;
        }
        if(find) return;

        for(int i = 0; i < arr.length; ++i){
            if(find) return;

            sb.append(arr[i]);
            if(sb.toString().equals(word)) {
                find = true;
                return;
            }
            answer++;
            makeDict(word, sb, arr, currentLevel + 1);
            sb.deleteCharAt(currentLevel);
        }
    }
}