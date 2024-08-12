import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        int defaultTime = fees[0];
        int defaultPrice = fees[1];
        int unitTime = fees[2];
        int unitPrice = fees[3];
        
        List<List<String>> exit = new ArrayList<>();
        List<List<String>> entrance =  new ArrayList<>();
        Map<String, Integer> cumulativeParkingTime = new HashMap<>();
        
        for(int i = 0; i < records.length; ++i){
            var sp = records[i].split(" ");
            var inout = sp[2];
            var carnum = sp[1];
            var time = sp[0];
            
            if(inout.equals("IN")){
             entrance.add(List.of(carnum, time));
            } else {
              exit.add(List.of(carnum, time));
            }
        }
        
        // 주차 요금 계산
        for(var list : entrance){
            String carNum = list.get(0);
            int time = timeToMinutes(list.get(1));
            int find = -1;
            for (int i = 0; i < exit.size(); ++i){
                if(exit.get(i).get(0).equals(carNum)){
                    find = i;
                    break;
                }
            }
            
            // 출차기록이 없는 경우 
            // 23:59에 출차된 것으로 간주
            if(find == -1){
                int minuteGap = timeToMinutes("23:59") - time;
                if(cumulativeParkingTime.containsKey(carNum)){
                    cumulativeParkingTime.replace(carNum, cumulativeParkingTime.get(carNum) + minuteGap);
                } else {
                    cumulativeParkingTime.put(carNum, minuteGap);
                }
            }  else {
                String cn = exit.get(find).get(0);
                int minuteGap = timeToMinutes(exit.get(find).get(1)) - time;
                if(cumulativeParkingTime.containsKey(cn)){
                    cumulativeParkingTime.replace(cn, cumulativeParkingTime.get(cn) + minuteGap);
                } else {
                    cumulativeParkingTime.put(cn, minuteGap);
                }
                exit.remove(find);
            }
            
        }
        
        List<String> sortedKeys = cumulativeParkingTime.keySet().stream().sorted().collect(Collectors.toList());
        int[] arr = new int[sortedKeys.size()];
        for(int i = 0; i< sortedKeys.size(); ++i){
            String num = sortedKeys.get(i);
            int time = cumulativeParkingTime.get(num);
            if(time <= defaultTime){
                arr[i] = defaultPrice;    
            } else {
     
                arr[i] = defaultPrice + (int)Math.ceil((time - defaultTime) / (double)unitTime) * unitPrice;
            }
            
        }
        return arr;
    }
    
    private int timeToMinutes(String str){
        var arr = str.split(":");
        return Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
    }
}