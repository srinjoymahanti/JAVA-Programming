package _14_BasicSorting;

public class _6_decreasingBubbleSort {
    public static void main(String[] args) {
        int[] arr={2,9,4,7,11,6};


        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean flag=true;
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]<arr[j+1]) {
                    flag = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(flag==true) break;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
