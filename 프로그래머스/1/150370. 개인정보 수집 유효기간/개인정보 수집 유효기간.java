import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        Map<Character,Integer> term = new HashMap<>();
        Map<String, Character> privace = new HashMap<>();
        for(var i : terms){
            String[] s = i.split(" ");
            term.put(s[0].charAt(0), Integer.parseInt(s[1]));
        }

        for(int i = 0; i< privacies.length; i++){
            var s = privacies[i].split(" ");
            var t = term.get(s[1].charAt(0)) * 28;
            var a = toDay(today);
            var b = toDay(s[0]);
            if( b + t <= a){
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public Integer toDay(String ymd){
        var s=ymd.split("[.]");
        var year = Integer.parseInt(s[0]);
        var month = Integer.parseInt(s[1]);
        var date = Integer.parseInt(s[2]);

        return year * (12 * 28) + (month * 28) + date;
    }
}