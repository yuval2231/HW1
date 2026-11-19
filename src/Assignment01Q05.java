public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int n = m.length;
        int[] dist = new int[n];
        for (int k = 0; k<n; k++){
            dist[k] = -1;
        }
        int[] queue = new int[n];
        int head = 0;
        int tail = 0;
        dist [i] = 0;
        queue[tail++] = i;
        while (head < tail) {
            int current = queue[head++];
            for (int next = 0; next < n; next++) {
                if (m[current][next] == 1 && dist[next] == -1) {
                    dist[next] = dist[current] + 1;
                    queue[tail++] = next;
                }
            }
        }
        return dist[j];
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}