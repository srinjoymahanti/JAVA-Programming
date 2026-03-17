package _20_Stack;

import java.util.Stack;

public class _6_removeAtAnyIndex {
    public static void remove(Stack<Integer> st,int idx){
        Stack<Integer> temp=new Stack<>();
        while(st.size()>idx+1){
            temp.push(st.pop());
        }
        st.pop();
        while(temp.size()>0){
            st.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(11);
        st.push(42);
        st.push(31);
        st.push(40);
        st.push(55);
        System.out.println(st);
        remove(st,2);
        System.out.println(st);
    }
}
