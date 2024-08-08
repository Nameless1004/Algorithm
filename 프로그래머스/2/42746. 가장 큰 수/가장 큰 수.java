import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String result="";
        List<String> temp = new ArrayList<>();

        for (int number : numbers) {
            temp.add(String.valueOf(number));
        }

        temp.sort((x,y)->{
            String l = x + y;
            String r = y + x;
            return -l.compareTo(r);
        });

        for (int i = 0; i < numbers.length; i++)
        {
            String find = "";
            for (int j = 0; j < temp.size(); j++){

            }
            result += temp.get(i);
        }

        if (result.charAt(0) == '0') return "0";
        return result;
    }
}