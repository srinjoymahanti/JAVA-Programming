package _9_Arrays;
import java.util.*;
public class _5_maxFromArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the element of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println("The maximum number is:"+max+" at index "+index);
    }
}
