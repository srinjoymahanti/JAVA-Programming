package _9_Arrays;

import java.util.Scanner;

public class _8_twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j] == num){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
}
