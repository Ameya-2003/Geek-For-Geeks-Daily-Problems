class Geeks {
    
    public long count(int n) {
        
        int[] ways = new int[n + 1];
        // Base case (If given value is 0)
        ways[0] = 1;
 
        // Consider all possible moves
        int[] moves = { 3, 5, 10 };
        for (int i = 0; i < 3; i++) {
            for (int j = moves[i]; j <= n; j++) {
                ways[j] += ways[j - moves[i]];
            }
        }
 
        return ways[n];
    }
}
