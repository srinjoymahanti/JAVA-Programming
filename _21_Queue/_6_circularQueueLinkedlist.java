package _21_Queue;

public class _6_circularQueueLinkedlist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static class CircularQueuell{
        Node head;
        Node tail;
        int size=0;
        public void add(int val){
            Node temp=new Node(val);
            if(size==0) head=temp;
            else tail.next=temp;
            tail=temp;
            tail.next=head;
            size++;
        }
        public int remove() throws Error{
            if(size==0) throw new Error("queue is empty");
            else{
                int val=head.data;
                head=head.next;
                tail.next=head;
                size--;
                return val;
            }
        }
        public int peek(){
            return head.data;
        }
        public void display(){
            Node temp=head;
            for (int i = 1; i <= size; i++) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueuell q=new CircularQueuell();
        q.add(12);
        q.add(19);
        q.add(23);
        q.add(56);
        q.display();
        q.remove();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
