package _20_Stack;

public class _8_linkedlistImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class Stack{
        private Node head=null;
        private int size=0;
        void push(int val){
            Node temp=new Node(val);
            temp.next=head;
            head=temp;
            size++;
        }
        int peek() throws Error{
            if(size==0) throw new Error("stack is empty");
            return head.val;
        }
        int pop() throws Error{
            if(size==0) throw new Error("stack is empty");
            int value= head.val;
            head=head.next;
            size--;
            return value;
        }
        int size(){
            return size;
        }
        void displayRec(Node head){
            Node temp=head;
            if(temp==null) return;
            displayRec(temp.next);
            System.out.print(temp.val+" ");
        }
        void display(){
            displayRec(head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(12);
        st.push(145);
        st.push(23);
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.size());
        st.pop();
    }
}
