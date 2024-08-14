import java.util.*;

class Solution {

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> s = new Stack<>();

        for(int i = numbers.length - 1; i >= 0; --i){
            int find = -1;
            while(s.size() > 0) {
                var p = s.peek();
                if(p > numbers[i]){
                    find = p;
                    break;
                } else s.pop();
            }

            if(find == -1){
                answer[i] = -1;
                s.push(numbers[i]);
            } else {
                s.push(numbers[i]);
                answer[i]= find;
            }
        }
        return answer;
    }
    
    private int find(int[] numbers, int myIndex){
        int cur = myIndex + 1;
        int curNum = numbers[myIndex];
        if(cur >= numbers.length) return -1;
        
        
        for(int i = cur; i < numbers.length; ++i){
            if(numbers[i] > curNum){
                return numbers[i];
            }    
        }
        
        return -1;
    }
}