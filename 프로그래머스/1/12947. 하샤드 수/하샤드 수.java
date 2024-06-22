class Solution {
    public boolean solution(int x) {
        int digitSum = 0;
        int input = x;
        while(x>0)
        {
            digitSum += x%10;
            x/=10;
        }
        if(input%digitSum==0) 
            return true;
        else
            return false;
    }
}