package LinkedList;

public class _6_deleteAtIndex {
    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;
        int size=0;

        void InsertAtIndex(int index,int data){
            Node t=new Node(data);
            Node temp=head;
            if(index==0){
                if(head==null){
                    head=tail=t;
                }
                else{
                    temp.next=head;
                    head=t;
                }
                size++;
                return;
            }
            else if(index==size){
                if(head == null){
                    head=t;
                }
                else{
                    tail.next=t;
                }
                tail=t;
                size++;
                return;
            }
            else if(index<0 || index>size){
                System.out.println("Wrong Input");
                return ;
            }
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.InsertAtIndex(0,3 );
        ll.InsertAtIndex(1, 6);
        ll.InsertAtIndex(2, 8);
        ll.display();
    } 
}
