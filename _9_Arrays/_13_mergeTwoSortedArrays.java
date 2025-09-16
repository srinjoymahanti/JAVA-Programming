package _9_Arrays;

public class _13_mergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr={2,3,7,9},brr={1,5,6,8};
        int m=arr.length,n=brr.length;
        int[] crr=new int[m+n];


//        int i=0,j=0,k=0;
//        while(i<m && j<n){
//            if(arr[i]<=brr[j]){
//                crr[k]=arr[i];
//                i++;
//            }
//            else{
//                crr[k]=brr[j];
//                j++;
//            }
//            k++;
//        }
//        if(i==m){//Now take elements from brr only
//            while(j<n){
//                crr[k]=brr[j];
//                j++;
//                k++;
//            }
//        }
//        if(j==n){//Now take elements from arr only
//            while(i<m){
//                crr[k]=arr[i];
//                i++;
//                k++;
//            }
//        }

        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0){
            if(arr[i]>=brr[j]){
                crr[k]=arr[i];
                i--;
            }
            else{
                crr[k]=brr[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            crr[k]=brr[j];
            j--;
        }
        while(i>=0){
            crr[k]=arr[i];
            i--;
        }
        for(int ele:crr){
            System.out.print(ele+" ");
        }
    }
}
