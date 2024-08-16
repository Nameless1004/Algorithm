import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
      List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] w : wires) {
            graph.get(w[0]).add(w[1]);
            graph.get(w[1]).add(w[0]);
        }

        int min = Integer.MAX_VALUE;
        for (int[] w : wires) {
            int start = w[0];
            int end = w[1];
            graph.get(start).removeIf(x -> x == end);
            graph.get(end).removeIf(x -> x == start);
            int l = dfs(graph, n, start);
            int r = dfs(graph, n, end);
            int abs = Math.abs( l - r);

            if (abs < min) {
                min = abs;
            }

            graph.get(start).add(end);
            graph.get(end).add(start);
        }

        return min;
    }
    
     private int dfs(List<List<Integer>> graph, int n, int start) {
        boolean[] visited = new boolean[n + 1];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;
        int count = 0;
        while (!stack.isEmpty()) {
            int p = stack.pop();
            count++;
            int size = graph.get(p).size();
            for (int i = 0; i < size; i++) {
                int neighbor = graph.get(p).get(i);
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }

        return count;
    }
}