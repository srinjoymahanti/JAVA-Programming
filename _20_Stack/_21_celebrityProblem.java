package _20_Stack;

import java.util.Stack;

public class _21_celebrityProblem {
    public static int celebrity(int[][] arr){
        int n= arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while(st.size()>1){
            int v1=st.pop();
            int v2=st.pop();
            if(arr[v1][v2]==0) st.push(v1);
            //if v1 dont know v2 , v1 can be potential celebrity
            else if(arr[v2][v1]==0) st.push(v2);
            //if v2 dont know v1 , v2 can be potential celebrity
        }
        if(st.isEmpty()) return -1;
        int potential=st.pop();
        for (int j = 0; j < n; j++) {
            if(arr[potential][j]==1) return -1;
        }
        for (int i = 0; i < n; i++) {
            if(i==potential)continue;;
            if(arr[i][potential]==0)return -1;
        }
        return potential;
    }
    public static void main(String[] args){
        int[][] matrix={{0,1,0},{0,0,0},{0,1,0}};
        System.out.println(celebrity(matrix));
    }
}
