class Solution {
    public String solution(String s, String skip, int index) {
        char[] chars = s.toCharArray();
        var sb = new StringBuilder();
        for (char c : chars) {
            int cnt = 0;
            char a = c;
            while(cnt < index){
                a++;
                if(a > 'z'){
                    a = 'a';
                }
                if(skip.indexOf(a) == -1){
                    cnt++;
                }else{
                    continue;
                }

                if(a > 'z'){
                    a = 'a';
                }
            }
            sb.append(a);
        }
        return sb.toString();
    }
}