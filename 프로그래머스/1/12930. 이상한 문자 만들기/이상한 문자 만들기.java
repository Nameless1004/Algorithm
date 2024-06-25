class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        int index = 0;
        for (int i = 0; i < s.length(); ++i)
        {
            if (sb.charAt(i) == ' ')
            {
                index = 0;
                continue;
            }

            if (index % 2 == 0)
            {
                // 알파벳을 대문자
                if ('a' <= sb.charAt(i) && sb.charAt(i) <= 'z')
                    sb.setCharAt(i,  (char)(sb.charAt(i) - 32));
            }
            else
            {
                // 알파벳을 소문자
                if ('A' <=  sb.charAt(i) &&  sb.charAt(i) <= 'Z')
                    sb.setCharAt(i,  (char)(sb.charAt(i) + 32));
            }
            index++;
        }
        return sb.toString();
    }
}