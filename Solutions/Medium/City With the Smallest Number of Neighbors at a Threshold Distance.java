class Solution {
    
    int[][] floydWarshall(int n, int[][] edges) {
        int[][] distances = new int[n][n];
        
        // Initialize distances to infinity
        for (int i = 0; i < n; i++) {
            Arrays.fill(distances[i], Integer.MAX_VALUE);
            distances[i][i] = 0; // Distance to self is 0
        }
        
        // Populate distances matrix with edge weights
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            distances[u][v] = w;
            distances[v][u] = w;
        }
        
        // Floyd-Warshall algorithm
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (distances[i][k] != Integer.MAX_VALUE && distances[k][j] != Integer.MAX_VALUE) {
                        distances[i][j] = Math.min(distances[i][j], distances[i][k] + distances[k][j]);
                    }
                }
            }
        }
        
        return distances;
    }
    
    int findCity(int n, int m, int[][] edges, int distanceThreshold) {
        int[][] distances = floydWarshall(n, edges);
        int minReachable = Integer.MAX_VALUE;
        int minCity = n;
        
        // Iterate through each city
        for (int city = 0; city < n; city++) {
            int reachableCount = 0;
            
            // Count reachable cities within distanceThreshold
            for (int i = 0; i < n; i++) {
                if (distances[city][i] <= distanceThreshold) {
                    reachableCount++;
                }
            }
            
            // Update minimum reachable count and corresponding city
            if (reachableCount < minReachable || (reachableCount == minReachable && city > minCity)) {
                minReachable = reachableCount;
                minCity = city;
            }
        }
        
        return minCity;
    }
}
