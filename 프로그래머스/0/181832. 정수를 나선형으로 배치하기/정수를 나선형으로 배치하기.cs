using System;

public class Solution {
    public int[,] solution(int n) {
        int[,] a = new int[n,n];
        int cnt = 0;

        // 오른쪽 아래 왼쪽 위
        int[] dirX = { 1, 0, -1, 0 };
        int[] dirY = { 0, 1, 0, -1 };

        int dirIndex = 0;
        int curNum = 1;
        int currentX = 0;
        int currentY = 0;


        while(cnt < n*n) 
        {
            a[currentY, currentX] = curNum;
            int curDirectionX = dirX[dirIndex];
            int curDirectionY = dirY[dirIndex];

            if (currentX + curDirectionX < 0 || currentX + curDirectionX >= n ||
                currentY + curDirectionY < 0 || currentY + curDirectionY >= n || a[currentY + curDirectionY, currentX + curDirectionX] != 0)
            {
                dirIndex = (dirIndex + 1) % 4;
                curDirectionX = dirX[dirIndex];
                curDirectionY = dirY[dirIndex];
            }
 
            currentX += curDirectionX;
            currentY += curDirectionY;
            cnt++;
            curNum++;
        }
        return a;
    }
}