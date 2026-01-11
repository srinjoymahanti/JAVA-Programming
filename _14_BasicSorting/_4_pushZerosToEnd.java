package _14_BasicSorting;

public class _4_pushZerosToEnd {
    public static void main(String[] args) {
        int[] arr={1,0,4,0,2,-40,100,0,5};
        int n=arr.length;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        for (int i = 0; i < n-1; i++) {
            boolean flag=true;
            for (int j = 0; j < n-1; j++) {
                if(arr[j]==0){
                    flag=false;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(flag==true) break;
            System.out.println();
            System.out.print(i+1+"pass-->");
            for(int ele:arr){
                System.out.print(ele+" ");
            }
        }
    }
}
