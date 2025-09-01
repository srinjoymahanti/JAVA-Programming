package _12_LinkedList;

public class _4_insertAtBeginning {
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

        void InsertAtBeginning(int data){
            Node temp=new Node(data);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
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
        ll.InsertAtBeginning(2);
        ll.display();
        System.out.println();
        ll.InsertAtBeginning(5);
        ll.display();
    }
    
}
