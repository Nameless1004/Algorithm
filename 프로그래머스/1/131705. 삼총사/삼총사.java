class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int start = 0;
        for(int i = 0; i < number.length - 2; ++i){
            for(int middle = i + 1; middle < number.length - 1; ++middle){
                for(int end = middle + 1; end < number.length; ++end){
                    if(number[i] + number[middle] + number[end] == 0) answer++;
                }
            }
        }
        return answer;
    }
}