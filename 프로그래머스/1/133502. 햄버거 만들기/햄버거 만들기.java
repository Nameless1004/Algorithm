import java.util.*;
class Solution {
 public int solution(int[] ingredient) {
int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1,3,2,1};
        for (int i = 0; i < ingredient.length; i++) {
            stack.add(ingredient[i]);
            if(stack.peek() == 1) {
                boolean find = true;
                if (stack.size() - 4 < 0) {
                    find = false;
                }
                else{
                    for (int j = 0; j < 4; j++) {
                        if (stack.get(stack.size()-1 - j) != arr[j]) {
                            find = false;
                            break;
                        }
                    }
                }

                if (find) {
                    answer++;
                    for (int cnt = 0; cnt < 4; ++cnt) stack.pop();
                }
            }
        }
        return answer;
    }
}