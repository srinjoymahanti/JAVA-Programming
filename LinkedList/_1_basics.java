package LinkedList;

public class _1_basics {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
        Node head=new Node(10);
        Node temp1=new Node(20);    
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=null;
        System.out.println(head.data);
        System.out.println(head.next);

        System.out.println(head.next.data);
        System.out.println(head.next.next);
        
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next);
    }
}
