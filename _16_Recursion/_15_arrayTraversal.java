package _16_Recursion;

public class _15_arrayTraversal {
    public static void print(int[] array,int i){
        if(i==array.length) return;
        System.out.print(array[i]+" ");
        print(array,i+1);
    }
    public static void main(String[] args) {
        int[] arr={2,9,4,0,1};
        print(arr,0);
    }
}
