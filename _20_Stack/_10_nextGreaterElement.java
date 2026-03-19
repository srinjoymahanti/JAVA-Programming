package _20_Stack;

import java.util.Stack;

public class _10_nextGreaterElement {
    public static int[] NGE(int[] arr){
        Stack<Integer> st= new Stack<>();
        int[] res=new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            while(!st.isEmpty() && st.peek()<arr[i]){
                st.pop();
            }
            if(st.isEmpty()) res[i]=-1;
            else res[i]=st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr={1,5,9,2,4,6,8,2};
        int[] res=NGE(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
