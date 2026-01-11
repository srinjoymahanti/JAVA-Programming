package _11_ArrayList;

import java.util.Arrays;

public class _2_copyOfArray {
    public static void main(String[] args){
        int[] arr = {3,6,9,2,4,8};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

//        int[] brr = arr; //Shallow Copy
//        brr[0]=70;
//        System.out.println(brr[0]);
//        System.out.println(arr[0]);

        int[] crr = Arrays.copyOf(arr,arr.length);//Deep Copy
        crr[0]=40;
        System.out.println(crr[0]);
        System.out.println(arr[0]);
    }
}
