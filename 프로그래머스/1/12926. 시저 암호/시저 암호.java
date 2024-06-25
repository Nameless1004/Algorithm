class Solution {
    public String solution(String s, int n) {
        var chararr = s.toCharArray();
        var sb = new StringBuilder();
        for(var i : chararr){

            int sum = i + n;
            if(Character.isLowerCase(i)) {
                if(sum > 'z'){
                    int shift = 'a' + (sum % 'z') - 1;
                    sb.append((char)shift);
                }
                else{
                    sb.append((char)sum);
                }
            }
            else if(Character.isUpperCase(i)){
                if(sum > 'Z'){
                    int shift = 'A' + (sum % 'Z') - 1;
                    sb.append((char)shift);
                }
                else{
                    sb.append((char)sum);
                }
            }
            else sb.append(i);
        }
        return sb.toString();
    }
}