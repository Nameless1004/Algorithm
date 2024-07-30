class Solution {
    public int[] solution(String s) {
        // x의 모든 0을 제거
        // x의 길이를 c라고하면, x를 "c를 2진법으로 표현한 문자열"로 바꾼다.
        int deleteCount = 0;
        int caclCount = 0;
        while(!(s.length() == 1 && s.charAt(0) == '1')){
            // x의 모든 0 제거
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0'){
                    deleteCount++;
                }
            }

            s = s.replaceAll("0", "");
            s = Integer.toBinaryString(s.length());

            caclCount++;
        }

        return new int[]{ caclCount, deleteCount};
    }
}