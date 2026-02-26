package _19_LinkedList;

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
        void deleteAtIndex(int idx){
            if(idx<0 || idx>=size) {
                System.out.println("wrong index");
                return;
            }
            if(idx==0){
                head=head.next;
                size--;
                return;
            }
            Node temp=head;
            for (int i = 1; i <idx ; i++) {
                temp=temp.next;
            }
            if(temp.next==tail) tail=temp;
            temp.next=temp.next.next;
            size--;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void size(){
            System.out.println(size);
        }
    }
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.InsertAtIndex(0,3 );
        ll.InsertAtIndex(1, 6);
        ll.InsertAtIndex(2, 8);
        ll.InsertAtIndex(3, 12);
        ll.InsertAtIndex(4, 7);
        ll.display();
        ll.size();
        ll.deleteAtIndex(3);
        ll.display();
        ll.size();
    } 
}
