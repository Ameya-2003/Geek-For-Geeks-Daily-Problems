class Solution {
    
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        Node temp = head;
        Node curr = head.next;
        
        
    while(temp!=null){
        curr = temp.next;
        while(curr!=null){
            if(temp.data>curr.data){
                int value = temp.data;
                temp.data = curr.data;
                curr.data = value;
            }
            curr = curr.next;
        }
        temp = temp.next;
        }
        
   
   return head;
}

}
