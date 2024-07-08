import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
       Map<String, Integer> idToIndex= new HashMap<>();
        Map<Integer, HashSet<Integer>> reportedInfo = new HashMap<>();

        int[] answer = new int[id_list.length];

        int index = 0;
        for(var id : id_list){
            idToIndex.put(id, index);
            reportedInfo.put(index, new HashSet<>());
            index++;
        }

        for(int i = 0; i < report.length; i++){
            var reportInfo = report[i].split(" ");
            int reporter = idToIndex.get(reportInfo[0]);
            int reported =  idToIndex.get(reportInfo[1]);
            var get = reportedInfo.get(reported);
            if(!get.contains(reporter))
            {
                get.add(reporter);
            }
        }
        reportedInfo.forEach((key,value)->{
            if(value.size() >= k){
                value.forEach(x->{
                    answer[x]++;
                });
            }
        });

        return answer;
    }
}