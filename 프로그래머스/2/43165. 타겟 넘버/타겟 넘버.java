class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        solve(numbers, target, 0, 0);
        return answer;
    }
    
    private void solve(int[] numbers, int target, int prev, int index){
        if(index >= numbers.length) return;
        int mcur = prev - numbers[index];
        int pcur = prev + numbers[index];
        
        if((mcur == target || pcur == target) && index == numbers.length - 1){
            answer++;
            return;
        }    
        
        solve(numbers, target, pcur,index + 1);
        solve(numbers, target, mcur,index + 1);
    }
}