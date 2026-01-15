package _15_BinarySearch;

public class _2_lowerBound {
    public static void main(String[] args) {
        int[] arr={10,20,30,30,40,50,60,70};
        int n=arr.length;
        int x=35;
        int lb=n,lo=0,hi=n-1;
        while (hi>=lo){
            int mid=(hi+lo)/2;
            if(arr[mid]>=x){
                lb=Math.min(lb,mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.print(lo);
    }
}
