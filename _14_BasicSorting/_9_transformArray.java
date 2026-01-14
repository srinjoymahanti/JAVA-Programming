package _14_BasicSorting;

public class _9_transformArray {
    public static void main(String[] args) {
        int[] arr={12,67,34,89,57,25};
        _5_SelectionSort.print(arr);
        int n= arr.length;

//      Method 1
//        int x=0;
//        for (int i = 0; i < n; i++) {
//            int min=Integer.MAX_VALUE;
//            int minIdx=0;
//            for (int j = 0; j < n; j++) {
//                if(arr[j]<min && arr[j]>0) {
//                    min=arr[j];
//                    minIdx=j;
//                }
//            }
//            arr[minIdx]=x;
//            x--;
//        }
//        for (int i = 0; i < n; i++) {
//            arr[i]*=(-1);
//        }


        //Methid 2
        for (int i = 0; i < n; i++) {
            int minIdx=0;
            int min=Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if(arr[j]<min && arr[j]>0){
                    min=arr[j];
                    minIdx=j;
                }
            }
            arr[minIdx]=-i;
        }
        for (int i = 0; i < n; i++) {
            arr[i]*=(-1);
        }

        _5_SelectionSort.print(arr);
    }
}
