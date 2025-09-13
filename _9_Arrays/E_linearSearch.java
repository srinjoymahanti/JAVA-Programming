package _9_Arrays;
import java.util.*;
public class E_linearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the number to search:");
        int x=sc.nextInt();

        boolean flag=false;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                flag=true;
                break;
            }
        }
        if(flag) System.out.println("Number found");
        else System.out.println("Number not found");
    }
    
}
