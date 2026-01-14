package _15_BinarySearch;

public class _1_binarySearch {
    public static void main(String[] args) {
        int[] arr={12,34,25,88,93,106,180,201,239,289,313,345,379};
        int target=88;
        int n=arr.length;
        boolean flag=false;
        int hi=n-1,lo=0;
        int idx=0;
        while(hi>=lo){
            int mid=(hi+lo)/2;
            if(arr[mid]==target){
                idx=mid;
                flag=true;
                break;
            }
            else if (target>arr[mid]) lo=mid+1;
            else if (target<arr[mid]) hi=mid-1;
        }
        if(flag==true) System.out.println("Taget "+target+" found at "+idx);
        else System.out.println("target not found");
    }
}
