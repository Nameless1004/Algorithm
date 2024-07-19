import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        return (int)(Arrays.stream(babbling).filter(x-> canSpeak(x)).count());
    }
    
    private boolean canSpeak(String str){
         str = str.replaceAll("(?<!ye)(ye)(?!ye)", "*");
        str = str.replaceAll("(?<!aya)(aya)(?!aya)", "*");
        str = str.replaceAll("(?<!woo)(woo)(?!woo)", "*");
        str = str.replaceAll("(?<!ma)(ma)(?!ma)", "*");
        for(var x: str.toCharArray()){
            if(x != '*') return false;
        }

        return true;
    }
}