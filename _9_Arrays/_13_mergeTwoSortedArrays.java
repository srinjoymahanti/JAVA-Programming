package _9_Arrays;

public class _13_mergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr={2,3,7,9},brr={1,5,6,8};
        int m=arr.length,n=brr.length;
        int[] crr=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(arr[i]<=brr[j]){
                crr[k]=arr[i];
                i++;
            }
            else{
                crr[k]=brr[j];
                j++;
            }
            k++;
        }
        if(i==m){//Now take elements from b only
            while(j<n){
                crr[k]=brr[j];
                j++;
                k++;
            }
        }
        if(j==n){//Now
            while(i<m){
                crr[k]=arr[i];
                i++;
                k++;
            }
        }
        for(int ele:crr){
            System.out.print(ele+" ");
        }
    }
}
