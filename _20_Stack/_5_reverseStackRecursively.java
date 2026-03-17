package _20_Stack;

import java.util.Stack;

public class _5_reverseStackRecursively {
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()) return;
        int val=st.pop();
        reverse(st);
        _4_pushAtBottom.pushAtBottomRecursively(st,val);
    }
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(11);
        st.push(42);
        st.push(31);
        st.push(40);
        st.push(55);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
