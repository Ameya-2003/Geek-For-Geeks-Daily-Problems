class Solution
{
    public ArrayList<ArrayList<Integer>> criticalConnections(int v, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
                ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[] rank = new int[v];
        Arrays.fill(rank, -1);
        int[] vis = new int[v];
        dfs(0, -1, rank, 0, adj, ans, vis);
 
        // Sort each edge in ascending order of nodes
        for (List<Integer> edge : ans) {
            Collections.sort(edge);
        }
 
        // Sort the list of edges
        ans.sort((a, b) -> {
            if (a.get(0).equals(b.get(0))) {
                return a.get(1) - b.get(1);
            }
            return a.get(0) - b.get(0);
        });
 
        return ans;
    }
       static int dfs(int i, int p, 
                   int[] rank, 
                   int k, 
                   ArrayList<ArrayList<Integer>> adj, 
                   ArrayList<ArrayList<Integer>> ans, 
                   int[] vis) {
        rank[i] = k;
        vis[i] = 1;
        int minDepth = Integer.MAX_VALUE;
 
        for (int ch : adj.get(i)) {
            if (ch != p) {
                if (vis[ch] == 1) {
                    minDepth = Math.min(minDepth, rank[ch]);
                } else {
                    int minRank = dfs(ch, i, rank, k + 1, adj, ans, vis);
 
                    if (rank[i] < minRank) {
                        ArrayList<Integer> edge = new ArrayList<>();
                        edge.add(i);
                        edge.add(ch);
                        ans.add(edge);
                    }
 
                    minDepth = Math.min(minRank, minDepth);
                }
            }
        }
        return minDepth;
    }
}
