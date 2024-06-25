class Solution {
    public int solution(String t, String p) {
        long ptoN = Long.parseLong(p);
        int answer = 0;
        for (long i = 0; i < (long)t.length(); ++i)
        {
            if (i + (long)p.length() > (long)t.length()) break;
            String str = t.substring((int)i, (int)i + p.length());
            long a = Long.parseLong(str);
            if (ptoN >= a)
                answer++;
        }
        
        return answer;
    }
}