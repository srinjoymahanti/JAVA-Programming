package _9_Arrays;

public class _11_sort0sand1s {
    public static void swap(int[] array, int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
    public static void main(String[] args) {
        int[] arr={0,0,0,1,0,1,1,1,0,1};
        int n=arr.length;


//        int noOfZeros=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==0) noOfZeros++;
//        }
//        for(int i=0;i<n;i++){
//            if(i<noOfZeros) arr[i]=0;
//            else arr[i]=1;
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }

        int start=0,end=n-1;
        while(start<=end){
            if(arr[start]==0) start++;
            if(arr[end]==0) end--;
            else swap(arr,start,end);
        }

    }
}
