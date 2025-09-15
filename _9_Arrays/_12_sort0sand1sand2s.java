package _9_Arrays;

public class _12_sort0sand1sand2s {
    public static void swap(int[] arr,int a,int b) {
        int temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,0,1,0,2,1,0,2,2,1};
        int n=arr.length;

//        //M-1
//        int noOfZeros=0,noOfOnes=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==0) noOfZeros++;
//            if(arr[i]==1) noOfOnes++;
//        }
//        for(int i=0;i<n;i++){
//            if(i<noOfZeros) arr[i]=0;
//            else if(i<noOfZeros+noOfOnes) arr[i]=1;
//            else arr[i]=2;
//        }

        //M-2 Dutch Flag Algorithm
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1) mid++;
            else {
                swap(arr,mid,high);
                high--;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
