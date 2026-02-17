package _17_AdavanceSorting;

import static _17_AdavanceSorting._1_mergeArray.print;

public class _4_quickSort {
    public static void swap(int[] array,int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
    public static int partition(int[] array,int lo,int hi){
        int mid=lo+(hi-lo)/2;
        int pivot=array[mid],pivotIdx=mid;
        int smallerCount=0;
        for (int i = lo; i <= hi; i++) {
            if(i==mid) continue;
            if(array[i]<pivot) smallerCount++;
        }
        pivotIdx=lo+smallerCount;
        swap(array,mid,pivotIdx);
        int i=lo,j=hi;
        while(i<pivotIdx && j>pivotIdx){
            if(array[i]<=pivot) i++;
            else if (array[j]>pivot) j--;
            else if(array[i]>pivot && array[j]<=pivot){
                swap(array,i,j);
                i++;j--;
            }
        }
        return pivotIdx;
    }
    public static void quickSort(int[] array,int lo,int hi){
        if(lo>=hi) return;
        int pIdx=partition(array, lo, hi);
        quickSort(array,lo,pIdx-1);
        quickSort(array,pIdx+1,hi);
    }
    public static void main(String[] args) {
        int[] arr={23,89,56,7,41,62};
        print(arr);
        quickSort(arr,0,arr.length-1);
        print(arr);
    }
}
