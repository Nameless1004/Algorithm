class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 0; i <= 9; ++i)
        {
            boolean isContains = false;
            for(int j = 0; j < numbers.length; ++j)
            {
                if(numbers[j]==i)
                {
                    isContains = true;
                    break;
                }
            }
            if(isContains == false)
            {
                answer +=i;
            }
        }
        return answer;
    }
}