class Solution {
    public int solution(String s) {
            int answer = 0;
            int xCount = 0;
            int otherCount = 0;
            int currentIndex = 0;
            while (true)
            {
                // ba na na
                if (currentIndex > s.length() - 1) break;
                char x = s.charAt(currentIndex);
                for(int i = currentIndex; i < s.length(); ++i)
                {
                    if (s.charAt(i) == x)
                        xCount++;
                    else
                        otherCount++;

                    if (xCount == otherCount)
                    {
                        answer++;
                        currentIndex = i;
                        otherCount = 0;
                        xCount = 0;
                        break;
                    }
                    if (i == s.length() - 1)
                    {
                        answer++;
                        return answer;
                    }
                }
                currentIndex++;
            }
            return answer;
    }
}