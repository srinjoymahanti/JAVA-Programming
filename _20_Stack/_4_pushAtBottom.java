package _20_Stack;

import java.util.Stack;

public class _4_pushAtBottom {
    public static void pushAtBottomRecursively(Stack<Integer> st,int val){
        if(st.size()==0) {
            st.push(val);
            return;
        }
        int num=st.pop();
        pushAtBottomRecursively(st,val);
        st.push(num);
    }
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(111);
        st.push(42);
        st.push(31);
        st.push(40);
        st.push(55);
        System.out.println(st);
        pushAtBottomRecursively(st,67);
        System.out.println(st);
    }
}
