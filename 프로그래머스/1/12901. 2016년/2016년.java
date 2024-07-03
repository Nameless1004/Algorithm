class Solution {
    public String solution(int a, int b) {
        String[] lut = {"FRI", "SAT", "SUN", "MON", "TUE","WED", "THU"};
        int[] month_list = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30,31};
        var total_days = 0;
        for(int i = 0; i < a-1; ++i){
            total_days += month_list[i];
        }
        total_days += b - 1;
        String answer = lut[total_days % 7];
        return answer;
    }
}