package _9_Arrays;

public class _11_sort0sand1s {
    public static void main(String[] args) {
        int[] arr={0,0,0,1,0,1,1,1,0,1};
        int n=arr.length;

//        //Method-1
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

        //Method-2
        int start=0,end=n-1;
        while(start<end){
            if(arr[start]==0) start++;
            else if(arr[end]==1) end--;
            else if(arr[start]==1 && arr[end]==0){
                arr[start]=0;
                arr[end]=1;
                start++;
                end--;
            }
        }


        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
