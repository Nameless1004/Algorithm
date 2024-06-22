class Solution {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6){
            var arr = s.toCharArray();
            for (char c : arr) {
                if((int)c > 57) return false;
            }
            return true;
        }
        
        return false;
    }
}