package _20_Stack;

import java.util.Stack;

public class _9_removeConsecutiveSubsequence {
    public static int[] remove(int[] arr){
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(st.isEmpty() || arr[i]!=st.peek()) st.push(arr[i]);
            else if(arr[i]==st.peek()){
                if(i< arr.length-1 && arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
        int[] res=new int[st.size()];
        for (int i = res.length-1; i >=0 ; i--) {
            res[i]=st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,4,5,7,8,8,2};
        int[] res=remove(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
