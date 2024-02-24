class Solution {
    public int maxSum(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        
        int divide2 = maxSum(n / 2);
        int divide3 = maxSum(n / 3);
        int divide4 = maxSum(n / 4);
        
        return Math.max(divide2 + divide3 + divide4, n);
    }
}
