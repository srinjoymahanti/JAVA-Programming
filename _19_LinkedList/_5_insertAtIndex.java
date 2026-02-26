package _19_LinkedList;

public class _5_insertAtIndex {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;
        int size=0;

        void InsertAtEnd(int data){
            Node temp=new Node(data);
            if(head == null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }

        void InsertAtBeginning(int data){
            Node temp=new Node(data);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
            size++;
        }

        void InsertAtIndex(int idx,int data){
            Node temp=new Node(data);
            Node x=head;
            if(idx==0){
                InsertAtBeginning(data);
                return;
            }
            if(idx==size) {
                InsertAtEnd(data);
                return;
            }
            if(idx<0 || idx>size){
                System.out.println("invalid index");
                return;
            }
            for(int i=1;i<idx;i++){
                x=x.next;
            }
            temp.next=x.next;
            x.next=temp;
            size++;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

         void size(){
             System.out.println("The length is:"+size);
         }

        void getAt(int idx) throws Error{
            if(idx==size) System.out.println(tail.data);
            if(idx<0 || idx>size){
                throw new Error("index not valid");
            }
            Node temp=head;
            for (int i = 1; i <= idx; i++) {
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
        void setAt(int idx,int data) throws Error{
            if(idx<0 || idx>size){
                throw new Error("Invalid index");
            }
            Node temp=head;
            for (int i = 1; i <= idx ; i++) {
                temp=temp.next;
            }
            temp.data=data;
        }
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.InsertAtEnd(3);
        ll.InsertAtEnd(7);
        ll.InsertAtEnd(4);
        ll.InsertAtEnd(2);
        ll.display();
        System.out.println();
        ll.InsertAtIndex(2, 9);
        ll.display();
        System.out.println();
        ll.size();
        ll.InsertAtIndex(9,5);
        ll.display();
        System.out.println();
        ll.size();
        ll.getAt(3);
        ll.setAt(3,1);
        ll.display();
    }
    
}
