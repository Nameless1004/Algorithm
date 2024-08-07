import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {

        class Node {
            public Integer priority;
            public Integer index;
        }

        int answer = 1;
        Queue<Node> ll = new LinkedList();
        for (int i = 0; i < priorities.length; i++) {
            var n = new Node();
            n.priority = priorities[i];
            n.index = i;
            ll.offer(n);
        }

        while(ll.isEmpty() == false) {
            var p = ll.poll();
            boolean hasGreaterPriority = ll.stream().anyMatch(x -> x.priority > p.priority);
            if (hasGreaterPriority) {
                ll.offer(p);
            } else{
                if(p.index == location){
                    break;
                } else answer++;
            }
        }

        return answer;
    }
}