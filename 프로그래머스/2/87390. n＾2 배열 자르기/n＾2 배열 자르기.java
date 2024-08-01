class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)right - (int)left + 1];
        for (int i = 0; i < answer.length; ++i)
        {
            long ind = left + i;
            long y = ind / n;
            long x = ind % n;
            if (x <= y)
            {
                answer[i] = (int)y + 1;
            }
            else
            {
                answer[i] = (int)x + 1;
            }
        }
        return answer;
    }
}