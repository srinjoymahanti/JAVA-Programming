package _19_LinkedList;

public class _8_doublyLinkedList {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        };
    }
    public static class DoublyLinkedList{
        Node head;
        Node tail;
        int size;
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(size==0) head=tail=temp;
            else{
                temp.next=head;
                head.prev=temp;
                head=head.prev;
            }
            size++;
        }
        void insertAtTail(int val){
            Node temp=new Node(val);
            if(size==0) head=tail=temp;
            else{
                temp.prev=tail;
                tail.next=temp;
                tail=tail.next;
            }
            size++;
        }
        void insertAtIndex(int idx,int val){
            if(idx<0 || idx>size) System.out.println("Invalid index");
            if(idx==0) {
                insertAtHead(val);
                return;
            }
            if(idx==size) {
                insertAtTail(val);
                return;
            }
            Node temp=new Node(val);
            Node t=head;
            for (int i = 1; i < idx; i++) {
                t=t.next;
            }
            temp.next=t.next;
            t.next.prev=temp;
            t.next=temp;
            temp.prev=t;
            size++;
        }
        void deleteAtHaed(){
            if(size==0) {
                System.out.println("nothing to delete");
                return;
            }
            if(size==1) head=tail=null;
            else{
                head=head.next;
                head.prev=null;
            }
            size--;
        }
        void deleteAtTail(){
            if(size==0) {
                System.out.println("nothing to delete");
                return;
            }
            if(size==1) {
                head=tail=null;
                size--;
                return;
            }
                tail=tail.prev;
                tail.next=null;
            size--;
        }
        void deleteAtIndex(int idx){
            if(idx<0 || idx>=size) System.out.println("invaid index");
            if(idx==0) {
                deleteAtHaed();
                return;
            }
            if(idx==size-1){
                deleteAtTail();
                return;
            }
            Node temp=head;
            for (int i = 1; i < idx; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp=temp.next;
            temp.prev=temp.prev.prev;
            size--;

        }
        void display(){
            Node temp= head;
            while(temp!= null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void size(){
            System.out.println("The size of the linkedlist is "+size);
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.insertAtIndex(0,12);
        dll.insertAtIndex(1,89);
        dll.insertAtIndex(2,65);
        dll.insertAtIndex(3,19);
        dll.display();
        dll.deleteAtIndex(2);
        dll.display();


    }
}
