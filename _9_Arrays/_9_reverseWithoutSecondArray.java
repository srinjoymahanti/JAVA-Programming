package _13_ArrayList;

import java.util.*;

public class _9_reverseWithoutSecondArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<n/2;i++){
            int j=n-1-i;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println("Reversed array is:");
        for(int i=0;i<n;i++){
        }
    }
}
