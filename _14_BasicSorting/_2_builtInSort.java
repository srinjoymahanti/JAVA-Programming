package _14_BasicSorting;

import java.util.Arrays;

public class _2_builtInSort {
    public static void main(String[] args) {
        int[] arr={3,53,15,9,61,22};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
