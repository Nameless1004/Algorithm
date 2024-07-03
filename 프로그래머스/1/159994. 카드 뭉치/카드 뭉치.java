class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
         int turn = 0;
        int[] indicies = {0, 0};
        String[][] temp = new String[2][];
        temp[0] = cards1;
        temp[1] = cards2;
        var swap = 0;
        for (; indicies[0] + indicies[1] < goal.length;) {
            if(swap == 2) return "No";
            if (temp[turn].length  <= indicies[turn]) {
                turn = (turn + 1) % 2;
                swap++;
                continue;
            }
            if (!goal[indicies[0] + indicies[1]].equals(temp[turn][indicies[turn]])) {
                swap++;
                turn = (turn + 1) % 2;
                continue;
            }
            else{
                indicies[turn]++;
                swap = 0;
            }
        }
        return "Yes";
    }

}