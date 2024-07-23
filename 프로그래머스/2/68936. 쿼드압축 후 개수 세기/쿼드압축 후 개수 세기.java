class Solution {
    public int[] solution(int[][] arr) {
        Compress(arr, arr.length, 0, 0);
        int[] answer = new int[] { resultZero, resultOne};
        return answer;
    }
    int resultOne = 0;
    int resultZero = 0;
    public void Compress(int[][] arr, int n, int x, int y)
    {
        if(n == 1)
        {
            var a  = arr[y][x] == 0 ? resultZero++ : resultOne++;
            return;
        }

        int zero = 0;
        int one = 0;
        for (int i = y; i < y + n; ++i)
        {
            for (int j = x; j < x + n; ++j)
            {
                if (arr[i][j] == 0) zero++;
                else if (arr[i][j] == 1) one++;
            }
        }
        if (zero > 0 && one == 0)
        {
            resultZero++;
        }
        else if (zero == 0 && one > 0)
        {
            resultOne++;
        }
        else
        {
            Compress(arr, n / 2, x, y);
            Compress(arr, n / 2, x + n / 2, y);
            Compress(arr, n / 2, x, y + n / 2);
            Compress(arr, n / 2, x + n / 2, y + n / 2 );
        }
    }
}