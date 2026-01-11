package _14_BasicSorting;

public class _3_BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int n=arr.length;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println();
            System.out.print(i+1+"pass-->");
            for(int ele:arr){
                System.out.print(ele+" ");
            }
        }

    }
}
