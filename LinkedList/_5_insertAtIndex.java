package LinkedList;

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

        void InsertAtIndex(int index,int data){
            Node t=new Node(data);
            Node temp=head;
            if(index==size){
                InsertAtEnd(data);
                return;
            }
            else if(index==0){
                InsertAtBeginning(data);
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

        // int size(){
        //     Node temp=head;
        //     int count=0;
        //     while(temp!=null){
        //         count++;
        //         temp=temp.next;
        //     }
        //     return count;
        // }

        void getAt(int index){
            Node temp=head;
            if(index<0 || index>size){
                System.out.println("Wrong Input");
                return;
            }
            for(int i=1;i<=index;i++){
                temp=temp.next;
            }
            System.out.println(temp.data);
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
        System.out.println(ll.size);
        ll.getAt(3);
        
    }
    
}
