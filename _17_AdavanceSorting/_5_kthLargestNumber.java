package _17_AdavanceSorting;

import java.util.Arrays;

import static _17_AdavanceSorting._1_mergeArray.print;
import static _17_AdavanceSorting._4_quickSort.swap;

public class _5_kthLargestNumber {
    static int ans;
    public static int partition(int[] arr,int lo,int hi,int k){
        int mid=lo+(hi-lo)/2;
        int pivot=arr[mid],pivotIdx=mid;
        int smallCount=0;
        for (int i = lo; i <= hi; i++) {
            if(i==pivotIdx) continue;
            if(arr[i]<pivot) smallCount++;
        }
        pivotIdx=lo+smallCount;
        swap(arr,pivotIdx,mid);
        int i=lo,j=hi;
        while(i<pivotIdx && j>pivotIdx){
            if(arr[i]<pivot) i++;
            else if(arr[j]>pivot) j--;
            else if (arr[i]>pivot && arr[j]<pivot){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    public static void quickSelect(int[] arr,int lo,int hi,int k){
        if(lo>hi) return;
        if(lo==hi){
            if(lo==k-1) ans=arr[lo];
            return;
        }
        int pIdx=partition(arr,lo,hi,k);
        if(pIdx==k-1){
            ans=arr[pIdx];
            return;
        }
        if(k-1 < pIdx) quickSelect(arr,lo,pIdx-1,k);
        else quickSelect(arr,pIdx+1,hi,k);
    }
    public static void main(String[] args) {
        int[] array={23,89,56,7,41,62};
        int n=array.length;
        int k=4;
        print(array);
        ans=-1;
        quickSelect(array,0, n-1,n-k+1);//for kth largest element
        //quickSelect(array,0, n-1,k);//For kth smallest element
        System.out.print(ans);

    }
}
