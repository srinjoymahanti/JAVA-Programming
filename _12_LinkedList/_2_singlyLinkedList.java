package _12_LinkedList;

public class _2_singlyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void displayRecursively(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        displayRecursively(head.next);
    }
    public static void main(String[] args){
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);

        a.next=b;
        b.next=c;
        
        display(a);
        System.out.println();
        displayRecursively(a);
    }
}
