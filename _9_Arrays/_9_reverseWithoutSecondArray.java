package _9_Arrays;

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

//        for(int i=0;i<n/2;i++){//Swap using for loop
//            int j=n-1-i;
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        }

        int x=0,y=n-1;//using while loop and method
        while(x<=y){
            swap(arr,x,y);
            x++;
            y--;
        }

        System.out.println("Reversed array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int[] array,int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}
