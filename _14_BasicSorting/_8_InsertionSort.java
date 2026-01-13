package _14_BasicSorting;

public class _8_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 9, 4, 7, 11, 6};
        int n = arr.length;


//        for (int i = 1; i < n; i++) {
//            for (int j = i; j > 0; j--) {
//                if (arr[j] < arr[j - 1]) {
//                    _5_SelectionSort.swap(arr, j, j - 1);
//                } else break;
//            }
//            _5_SelectionSort.print(arr);
//        }

        for (int i = 1; i < n; i++) {
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                _5_SelectionSort.swap(arr,j,j-1);
                j--;
            }
            _5_SelectionSort.print(arr);
        }
    }
}
