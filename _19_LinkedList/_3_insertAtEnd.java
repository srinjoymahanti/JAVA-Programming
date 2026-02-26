package _19_LinkedList;

public class _3_insertAtEnd {

//    public static class Node {
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//        }
//    }
//
//    public static class LinkedList{
//        Node head=null;
//        Node tail=null;
//
//        void InsertAtEnd(int data){
//            Node temp=new Node(data);
//            if(head == null){
//                head=temp;
//            }
//            else{
//                tail.next=temp;
//            }
//            tail=temp;
//        }
//
//        void display(){
//            Node temp=head;
//            while(temp!=null){
//                System.out.print(temp.data+" ");
//                temp=temp.next;
//            }
//        }
//
//        int size(){
//            Node temp=head;
//            int count=0;
//            while(temp!=null){
//                count++;
//                temp=temp.next;
//            }
//            return count;
//        }
//    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head,tail;
        int size;
        void insertAtEnd(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        void size(){
            System.out.println("The size of ll is:"+size);
        }
    }
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();
        ll.size();
    }
    
}
