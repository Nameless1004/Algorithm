import java.util.*;
class Solution {
     public int[] solution(int brown, int yellow) {
        int[] arr = findXY(brown, yellow);
        return arr;
    }

    private  int[] findXY(int br, int ye) {
        // 노란색 기준으로
        // ye 가 되는 경우의 수를 알아본 후 +2 +2 해준다.
        ArrayList<Integer> arr = getDivisors(ye);
        var start = 0;
        var end = arr.size() - 1;
        while(start <= end){
            int x = arr.get(start);
            int y = arr.get(end);
            if(br == getTeduri(x + 2, y + 2)){
                return new int[]{y + 2,x + 2};
            }
            end--;
            start++;
        }
        return null;
    }
    
    private  ArrayList<Integer> getDivisors(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(var i = 1 ; i <= Math.sqrt(num) ; i++){
            if(num % i == 0) {
                arr.add(i);
                if(num / i != i) arr.add(num / i);
            }
        }
        arr.sort(Integer::compareTo);
        return arr;
    }

     public int getTeduri(int x, int y){
        // 4*3 일때
        return x * 2 + (y - 2) * 2;
    }
}