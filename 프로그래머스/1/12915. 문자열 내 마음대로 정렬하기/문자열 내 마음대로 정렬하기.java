import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        
        class comparator implements Comparator<String> {
            public int n;
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n) == o2.charAt(n)){
                    return o1.compareTo(o2);
                }
                else{
                    int l = o1.charAt(n);
                    int r = o2.charAt(n);
                   return Integer.compare(l, r);
                }
            }
        }
        var comp =  new comparator();
        comp.n = n;
        Arrays.sort(strings, comp);
        
        return strings;
    }
}