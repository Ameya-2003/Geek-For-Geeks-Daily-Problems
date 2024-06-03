class Solution {
    public int minJumps(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1; // If array is empty or null, return -1
        }
        
        int n = arr.length;
        if (n == 1) {
            return 0; // No jumps needed if already at the end
        }
        
        if (arr[0] == 0) {
            return -1; // If the first element is 0, we cannot move forward
        }
        
        int maxReach = arr[0]; // The maximum index we can reach so far
        int steps = arr[0];    // The number of steps we can still take
        int jumps = 1;         // Initial jump
        
        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                return jumps; // If we've reached the end, return the number of jumps
            }
            
            maxReach = Math.max(maxReach, i + arr[i]); // Update maxReach
            steps--; // Use a step
            
            if (steps == 0) { // If no steps are left
                jumps++; // We need to jump
                if (i >= maxReach) {
                    return -1; // If we cannot move forward, return -1
                }
                steps = maxReach - i; // Re-initialize steps to the amount of steps to reach maxReach
            }
        }
        
        return -1; // If we exit the loop without reaching the last index, return -1
    }
}
