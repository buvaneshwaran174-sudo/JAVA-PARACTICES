import java.util.*;

class Solution {

    public int minCostConnectPoints(int[][] points) {

        int n = points.length;

        boolean[] visited = new boolean[n];

        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> a[0] - b[0]);

        pq.offer(new int[]{0, 0});

        int cost = 0;
        int edges = 0;

        while (edges < n) {

            int[] current = pq.poll();

            int weight = current[0];
            int node = current[1];

            if (visited[node])
                continue;

            visited[node] = true;

            cost += weight;
            edges++;

            for (int i = 0; i < n; i++) {

                if (!visited[i]) {

                    int distance =
                            Math.abs(points[node][0] - points[i][0]) +
                            Math.abs(points[node][1] - points[i][1]);

                    pq.offer(new int[]{distance, i});
                }
            }
        }

        return cost;
    }
}