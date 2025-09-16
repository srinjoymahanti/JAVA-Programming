package _9_Arrays;

import java.util.*;

public class _9_reverseFromGivenIndex {
    public static void reverse(int[] array,int a,int b){
        while(a<=b){
            int temp = array[a];
            array[a]=array[b];
            array[b]=temp;
            a++;
            b--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of rotations");
        int k=sc.nextInt();

        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
