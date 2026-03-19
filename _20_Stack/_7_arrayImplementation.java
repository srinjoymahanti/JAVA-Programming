package _20_Stack;

public class _7_arrayImplementation {
    public static class Stack{
        int[] arr=new int[5];
        int idx=0;
        void push(int val)throws Error{
            if(isFull()) throw new Error("stack is full");
            arr[idx]=val;
            idx++;
        }
        int peek () throws Error{
            if(idx==0) throw new Error("stack is empty");
            return arr[idx-1];
        }
        int pop() throws Error{
            if(idx==0) throw new Error("stack is empty");
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        int size(){
            return idx;
        }
        void display(){
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        boolean isEmpty(){
            return idx == 0;
        }
        boolean isFull(){
            return idx== arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(11);
        st.push(23);
        st.push(41);
        st.push(78);
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.pop();
        System.out.println(st.size());
        st.pop();
        System.out.println(st.peek());
        st.pop();


    }
}
