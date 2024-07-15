import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        int[] a = new int[4];
        a[0] = -1000;
        a[1]= first(answers);
        a[2]= second(answers);
        a[3] = third(answers);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        int maxI = -1;
        int max = -1;
        for(int i = 1; i < 4; ++i)
        {
            if(a[i] >= max){
                max = a[i];
                maxI = i;
            }
        }
        
        for(int i = 1; i < a.length; ++i){
            if(a[i] >= max)
                list.add(i);
        }
        
        var result = list.stream().sorted().mapToInt(Integer::intValue).toArray();
        return result;
    }
    
    public int first(int[] answer){
        int result = 0;
        for(int i = 0; i < answer.length; ++i)
        {
            if(answer[i] == (i % 5)+1) result++;
        }
        
        return result;
    }
    
    public int second(int[] answer){
        int result = 0;
        int j = 0;
        int[] arr = {1,3,4,5};
        for(int i = 0; i < answer.length; ++i)
        {
            if(i % 2== 0){
                if(answer[i]==2) result++;
            }
            else{
                if(answer[i] == arr[j]) result++;
                j++;
                if(j >= 4) j = 0;
            }
        }
        
        return result;
        
    }
    
    public int third(int[] answer){
        int[] arr = {3,1,2,4,5};
        int index = 0;
        int result = 0;
        int cnt = 0;
        for(int i = 0; i < answer.length; ++i)
        {
            if(answer[i] == arr[index])  result++;
            
            cnt++;
            if(cnt >= 2) {
                cnt = 0;
                index = (index + 1) % 5;
            }
        }
        
        return result;
    }
}