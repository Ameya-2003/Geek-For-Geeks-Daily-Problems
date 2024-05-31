class Solution {
    long sumOfSeries(long n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        
        // Recursive call and accumulation
        return sumOfSeries(n - 1) + (n * n * n);
    }
}
