class Solution {
    public String solution(String s) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }


        return min + " " + max;
    }
}