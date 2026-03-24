package _20_Stack;

import java.util.Stack;

public class _11_stockSpanProblem {
    public static int[] span(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] res=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(st.isEmpty()) res[i]=i+1;
            else res[i]=i-st.peek();
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        int[] res=span(arr);
        for (int re : res) {
            System.out.print(re + " ");
        }
    }
}
