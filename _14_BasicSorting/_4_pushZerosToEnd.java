package _14_BasicSorting;

public class _4_pushZerosToEnd {
    public static void main(String[] args) {
        int[] arr={1,0,4,0,2,-40,100,0,5};
        int n=arr.length;
        int noz=0;
        for(int ele:arr){
            if(ele==0) noz++;
            System.out.print(ele+" ");
        }
        for (int i = 0; i < noz; i++) {
            for (int j = 0; j < n-1; j++) {
                if(arr[j]==0){
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
