package _21_Queue;

public class _4_linkedlistImplementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class queuell{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int val){
            Node temp=new Node(val);
            if(size==0) head=temp;
            else {
                tail.next=temp;
            }
            tail=temp;
            temp.next=null;
            size++;
        }
        public int remove() throws Error{
            if(size==0) throw new Error("queue is empty");
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }
        public int peek(){
            return head.data;
        }
        public int size(){
            return size;
        }
        public boolean isEmpty(){
            return size==0;
        }
        public void display(){
            Node temp=head;
            System.out.print("[ ");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println("]");
        }
    }
    public static void main(String[] args) {
        queuell q=new queuell();
        q.add(13);
        q.add(35);
        q.add(78);
        q.add(29);
        q.display();
        System.out.println(q.size());
        q.remove();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
