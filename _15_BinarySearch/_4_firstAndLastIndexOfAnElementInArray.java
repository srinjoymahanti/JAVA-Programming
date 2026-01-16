package _15_BinarySearch;

public class _4_firstAndLastIndexOfAnElementInArray {
    public static void main(String[] args) {
        int[] arr={10,10,10,20,20,20,20,20,30,30,40,40,40,40};
        int n=arr.length;
        int target=20;
        int fstIdx=-1,lstIdx=-1;
        int lo=0,hi=n-1;
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){
                if(mid>0 && arr[mid-1]==arr[mid]) hi=mid-1;
                else{
                    fstIdx=mid;
                    break;
                }
            }
            else if (arr[mid]<target) lo=mid+1;
            else if (arr[mid]>target) hi=mid-1;
        }
        lo=0;hi=n-1;
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){
                if(mid<n-1 && arr[mid]==arr[mid+1]) lo=mid+1;
                else{
                    lstIdx=mid;
                    break;
                }
            }
            else if (arr[mid]<target) lo=mid+1;
            else if (arr[mid]>target) hi=mid-1;
        }
        System.out.println("the first index is "+fstIdx);
        System.out.println("the last index is "+lstIdx);
    }
}
