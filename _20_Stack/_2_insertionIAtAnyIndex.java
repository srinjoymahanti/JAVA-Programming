package _20_Stack;

import java.util.Stack;

public class _2_insertionIAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        //0 based indexing
        int idx=2;
        int val=8;
        Stack<Integer> temp=new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(val);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
