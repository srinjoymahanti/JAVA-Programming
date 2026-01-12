package _14_BasicSorting;

public class _5_SelectionSort {
    public static void print(int[] array){
        for(int ele : array){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] array,int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
    public static void main(String[] args) {
        int[] arr={10,-4,20,1,-6,8};
        print(arr);
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            int min=Integer.MAX_VALUE;
            int minIdx=-1;
            for (int j = i; j < n; j++) {
                if(arr[j]<min) {
                    min = arr[j];
                    minIdx = j;
                }
            }
            swap(arr,i,minIdx);
            System.out.print(i+1+" pass-> ");
            print(arr);
        }

    }
}
