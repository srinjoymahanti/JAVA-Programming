package _17_AdavanceSorting;

public class _1_mergeArray {
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
    public static void main(String[] args) {
        int[] arr={10,44,67,78,91};
        int[] brr={22,33,54,59,70,87};
        int[] crr=new int[arr.length+brr.length];
        merge(arr,brr,crr);
        print(arr);
        print(brr);
        print(crr);
    }
}
