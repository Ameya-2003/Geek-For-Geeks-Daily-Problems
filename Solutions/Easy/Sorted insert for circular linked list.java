//User function Template for Java
class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            newNode.next = head;
            return head;
        }
        
        if(head.data > data){
            Node temp = head.next;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
            return head;
        }
        
        Node temp = head.next;
        Node prev = head;
        while(temp != head && temp.data < data){
            prev=temp;
            temp = temp.next;
        }
        prev.next = newNode;
        newNode.next = temp;
        return head;
    }
}
