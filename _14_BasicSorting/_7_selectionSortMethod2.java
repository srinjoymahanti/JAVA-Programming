package _14_BasicSorting;

public class _7_selectionSortMethod2 {
    public static void swap(int[] array,int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,9,4,7,11,6};
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            int maxIdx=0;
            for (int j = 0; j < n-i; j++) {
                if(arr[j]>arr[maxIdx]){
                    maxIdx=j;
                }
            }
            swap(arr,maxIdx,n-1-i);
        }
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
        _5_SelectionSort.print(arr);
    }
}
