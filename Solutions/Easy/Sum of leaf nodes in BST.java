class Solution {
    public static int sumOfLeafNodes(Node root) {
        int[] sum = new int[1]; // Array of size 1 to hold the sum
        sum[0] = 0; // Initialize sum
        preOrder(root, sum);
        return sum[0];
    }

    public static void preOrder(Node root, int[] sum) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            sum[0] += root.data;
            return;
        }

        preOrder(root.left, sum);
        preOrder(root.right, sum);
    }
}
