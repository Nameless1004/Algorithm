import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        List<Character> l = new ArrayList();
        String L = X.length() <= Y.length() ? X : Y;
        String R = L == X ? Y:X;
        
        var larr = L.toCharArray();
        var rarr = R.toCharArray();
        Arrays.sort(larr);
        Arrays.sort(rarr);
        var li = 0;
        var ri = 0;
        
        var llen = L.length();
        var rlen = R.length();
        boolean allzero = true;
        while(li < llen && ri < rlen){
            if(larr[li] == rarr[ri])
            {
                if(allzero == true && rarr[ri] != '0') allzero = false;
                l.add(rarr[ri]);
                li++;
                ri++;
            }
            else if(larr[li] < rarr[ri]){
                li++;
            }
            else ri++;
        }

        if(l.size() == 0) return "-1";
        else if(allzero) return "0";
        else{
            StringBuilder sb = new StringBuilder();
            for(int i = l.size() - 1; i >= 0; --i){
                sb.append(l.get(i));
            }
            return sb.toString();
        }
    }
}