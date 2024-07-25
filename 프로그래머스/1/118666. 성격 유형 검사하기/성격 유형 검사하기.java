import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<char[]> list = new ArrayList<>();
        list.add(new char[]{'R', 'T'});
        list.add(new char[]{'C', 'F'});
        list.add(new char[]{'J', 'M'});
        list.add(new char[]{'A', 'N'});

        list.forEach(x -> {
            map.put(x[0], 0);
            map.put(x[1], 0);
        });

        String answer = "";
        for (int i = 0; i < survey.length; i++) {
            int choice = choices[i];
            if (choice == 4) continue;

            var l = survey[i].charAt(0);
            var r = survey[i].charAt(1);

            if (choice < 4) {
                int c = Math.abs(4 - choice);
                map.replace(l, map.get(l) + c);
            } else {
                int c = Math.abs(choice - 4);
                map.replace(r, map.get(r) + c);
            }
        }


        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++) {
            // 동일 지표 검사
            var arr = list.get(i);
            if(map.get(arr[0]) == map.get(arr[1])){
                sb.append(arr[0] > arr[1] ? arr[1] : arr[0]);
            }
            else{
                char greater = map.get(arr[0]) > map.get(arr[1]) ? arr[0] : arr[1];
                sb.append(greater);
            }
        }


        return sb.toString();
    }
}