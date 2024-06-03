using System;

public class Solution {
    public int[] solution(int[] arr, int n) {
        bool isOdd = arr.Length % 2 == 0 ? false : true;
        
        for(int i = 0; i < arr.Length; ++i){
            if(isOdd){
                if(i % 2 == 0){
                    arr[i] += n;
                }
            }
            else{
                if(i % 2 != 0){
                    arr[i] += n;
                }
            }
        }
        return arr;
    }
}