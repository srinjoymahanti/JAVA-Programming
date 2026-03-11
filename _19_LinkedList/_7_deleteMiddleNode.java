package _19_LinkedList;

public class _7_deleteMiddleNode {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class SLL{
        Node head;
        Node tail;
        int size;
        void insertAtIndex(int idx,int val){
            if(idx<0 || idx>size){
                System.out.println("invalid index");
                return;
            }
            Node temp=new Node(val);
            if(idx==0){
                if(head==null){
                    tail=temp;
                }
                else temp.next=head;
                head=temp;
                size++;
                return;
            }
            if(idx==size){
                tail.next=temp;
                tail=temp;
                size++;
                return;
            }
            Node x=head;
            for (int i = 1; i < idx; i++) {
                x=x.next;
            }
            temp.next=x.next;
            x.next=temp;
            size++;
        }
        void display(){
            Node x=head;
            for (int i = 1; i <= size ; i++) {
                System.out.print(x.val+" ");
                x=x.next;
            }
            System.out.println();
        }
    }
    public static void leftMiddle(Node node){
        
    }
    public static void main(String[] args){
        SLL ll=new SLL();
        ll.insertAtIndex(0,2);
        ll.insertAtIndex(1,5);
        ll.insertAtIndex(2,7);
        ll.insertAtIndex(3,3);
        ll.display();
        ll.insertAtIndex(0,11);
        ll.display();
        ll.insertAtIndex(2,9);
        ll.display();
    }

}
