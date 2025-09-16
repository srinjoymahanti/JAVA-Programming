package _9_Arrays;
import java.util.*;
public class _6_secondMaxInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        int smx=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]>smx && arr[i]<mx){
                smx=arr[i];
                index=i;
            }
        }
        System.out.println("The second maximum number is:"+smx+" at index"+index);

    }
}
