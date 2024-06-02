function solution(arr) {
    var answer = [];
  
        for(let i = 0; i < arr.length;){
            let lastIndex = answer.length - 1;
            
            if(answer.length == 0){
                answer.push(arr[i++]);
            }
            else if(answer[lastIndex] == arr[i]){
                answer.splice(lastIndex, 1);
                i++;
            }
            else{
                answer.push(arr[i++]);
            }
        }
        
        if(answer.length == 0){
            let t = [];
            t.push(-1);
            return t;
        };
        return answer;
    return answer;
}