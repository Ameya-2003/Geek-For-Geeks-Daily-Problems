class Solution {
    public static void inorderTraversal(Node root, ArrayList<Integer> arrli) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left, arrli);
        arrli.add(root.data);
        inorderTraversal(root.right, arrli);
        
    }
    public Node result(ArrayList<Integer> arrli){
       if(arrli.isEmpty()) return null;
       
        Node root= new Node(arrli.get(0));
        Node temp=root;
        
        for(int i=1;i<arrli.size();i++){
            //  temp.right.data=arrli.get(i);
            // // temp.left=null;
              temp.right=new Node(arrli.get(i));
              temp=temp.right;
        }
        return root;
    }
    
    public Node flattenBST(Node root) {
        if (root == null) {
            return null;
        }
       
        // Code here3
         ArrayList<Integer> arrli = new ArrayList<>();
         inorderTraversal(root, arrli);
         
         Node res=result(arrli);
         return res;
         
        
    }
}
