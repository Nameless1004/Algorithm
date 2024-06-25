import java.util.*;

class Solution {
    public int solution(String s) {
        Map<String,Integer> aton = new HashMap<>();
        aton.put("zero",0);
        aton.put("one",1);
        aton.put("two",2);
        aton.put("three",3);
        aton.put("four",4);
        aton.put("five",5);
        aton.put("six",6);
        aton.put("seven",7);
        aton.put("eight",8);
        aton.put("nine",9);

        StringBuilder sb = new StringBuilder();
        var arr = s.toCharArray();
        for(int i = 0; i < arr.length;){
            if(Character.isDigit(arr[i])){
                sb.append(arr[i++]);
            }
            else {
                var sbsb = new StringBuilder();
                while (true) {
                    if (i >= arr.length || !Character.isAlphabetic(arr[i])) {
                        break;
                    }
                    sbsb.append(arr[i]);

                    if (aton.get(sbsb.toString()) != null) {
                        sb.append(aton.get(sbsb.toString()));
                        sbsb.setLength(0);
                    }
                    i++;
                }
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
}