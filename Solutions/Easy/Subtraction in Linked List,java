class Solution {
    public Node reverse(Node node){
        Node cur=node,prev=null,next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    public int length(Node node){
        int length=0;
        while(node!=null){
            length++;
            node=node.next;
        }
        return length;
    }
    public Node subLinkedList(Node head1, Node head2) {
        while(head1!=null && head1.data==0){
            head1=head1.next;
        }
        while(head2!=null && head2.data==0){
            head2=head2.next;
        }
        
        int n1=length(head1);
        int n2=length(head2);
        if(n1==0 && n2==0) return new Node(0);
        if(n2>n1){
            Node temp=head1;
            head1=head2;
            head2=temp;
        }
        
        if(n1==n2){
            Node temp1=head1;
            Node temp2=head2;
            while(temp1.data==temp2.data){
                temp1=temp1.next;
                temp2=temp2.next;
                if(temp1==null){
                    return new Node(0);
                }
            }
            if(temp2.data>temp1.data){
                Node temp=head1;
                head1=head2;
                head2=temp;
            }
        }
        
        head1=reverse(head1);
        head2=reverse(head2);
        
        Node temp1=head1;
        Node temp2=head2;
        
        Node ans=null;
        
        while(temp1!=null){
            int less=0;
            if(temp2!=null){
                less=temp2.data;
            }
            if(temp1.data<less){
                if(temp1.next!=null){
                    temp1.next.data-=1;
                }
                temp1.data+=10;
            }
            Node ne=new Node(temp1.data-less);
            ne.next=ans;
            ans=ne;
            temp1=temp1.next;
            if(temp2!=null){
                temp2=temp2.next;
            }
        }
        while(ans!=null && ans.next!=null && ans.data==0){
            ans=ans.next;
        }
        return ans;
    }
}
