import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
       List<Integer> answer = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        List<Integer> s = new ArrayList<>();

        for(int i = 0; i < progresses.length; ++i){
            p.add(progresses[i]);
            s.add(speeds[i]);
        }

        while(!p.isEmpty()) {

            for(int i = 0; i < p.size(); ++i) {
                p.set(i, p.get(i) + s.get(i));
            }

            if(p.get(0) >= 100){
                int cnt = 0;
                List<Integer>indicies = new ArrayList();
                for(int i = 0; i < p.size(); ++i) {
                    if(p.get(i) >= 100){
                        indicies.add(i);
                    } else {
                        break;
                    }
                }

                for(int i = indicies.size() - 1; i >= 0; --i) {
                    p.remove(i);
                    s.remove(i);
                }

                answer.add(indicies.size());
            }
        }

        return answer.stream().mapToInt(x->x).toArray();
    }
}