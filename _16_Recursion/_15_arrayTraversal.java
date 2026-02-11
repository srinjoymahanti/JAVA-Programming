package _16_Recursion;

public class _15_arrayTraversal {
    public static void print(int[] array,int n){
        if(n<0) return;
        print(array,n-1);
        if(array.length!=n) System.out.println(array[n]);
    }
    public static void main(String[] args) {
        int[] arr={2,9,4,0,1};
        print(arr,arr.length);
    }
}
