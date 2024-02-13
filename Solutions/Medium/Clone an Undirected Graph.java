class Solution{
    void sol(Node root,HashMap<Node,Node> hm){
       if(hm.containsKey(root))
           return;
       hm.put(root,new Node(root.val,new ArrayList<Node>()));
       for(Node i:root.neighbors){
           if(!hm.containsKey(i))
               sol(i,hm);
           hm.get(i).neighbors.add(hm.get(root));    
           
           
       }
       return;
   }
   Node cloneGraph(Node node){
       
HashMap<Node,Node> hm = new HashMap<>();
sol(node,hm);
return hm.get(node);
   }


}
