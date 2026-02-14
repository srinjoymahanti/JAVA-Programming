package _17_AdavanceSorting;

public class _2_mergeSort {
    public static void print(int[] array){
        for(int ele:array){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] a,int[] b,int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
    }
    public static void mergeSort(int[] array){
        int n=array.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        for(int i=0;i<a.length;i++){
            a[i]=array[i];
        }
        for (int i = 0; i < b.length; i++) {
            b[i]=array[n/2+i];
        }
        mergeSort(a);
        mergeSort(b);

        merge(a,b,array);
        //delete the arrays, just to improve time complexity
        a=null;b=null;
    }
    public static void main(String[] args){
        int[] arr={19,78,23,69,45,59,37};
        print(arr);
        mergeSort(arr);
        print(arr);
    }
}
