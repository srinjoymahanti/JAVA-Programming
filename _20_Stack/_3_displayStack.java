package _20_Stack;

import java.util.Stack;

public class _3_displayStack {
    public static void displayRecursively(Stack<Integer> st){
        if(st.size()==0) return;
        int val=st.pop();
        displayRecursively(st);
        System.out.print(val+" ");
        st.push(val);
    }
    public static void main(String[] args){
        Stack<Integer> st =new Stack<>();
        st.push(111);
        st.push(42);
        st.push(31);
        st.push(40);
        st.push(55);
        System.out.println(st);

//        //Using extra array
//        int[] arr=new int[st.size()];
//        int i=arr.length-1;
//        while(st.size()>0){
//            arr[i]=st.pop();
//            i--;
//        }
//        for (int j = 0; j < arr.length; j++) {
//            System.out.print(arr[j]+" ");
//            st.push(arr[j]);
//        }

//        //using extra stack
//        Stack<Integer> temp=new Stack<>();
//        while(st.size()>0){
//            temp.push(st.pop());
//        }
//        System.out.println(temp);
//        while(temp.size()>0){
//            System.out.print(temp.peek()+" ");
//            st.push(temp.pop());
//        }

        displayRecursively(st);
    }
}
