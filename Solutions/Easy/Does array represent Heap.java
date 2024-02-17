class Solution {
    
    public boolean countSub(long arr[], long n) {
        // Traverse the array starting from the middle towards the beginning
        // We only need to check non-leaf nodes, so start from the parent of the last element
        for (int i = (int)(n / 2) - 1; i >= 0; i--) {
            // Calculate left and right children indices
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            
            // Check if the left child exists and if it is greater than the parent
            if (leftChild < n && arr[leftChild] > arr[i])
                return false;
            
            // Check if the right child exists and if it is greater than the parent
            if (rightChild < n && arr[rightChild] > arr[i])
                return false;
        }
        
        return true;
    }
}
