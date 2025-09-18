package _10_2DArrays;

import java.util.Scanner;

public class _3_largestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][2];
        System.out .println("Enter the array:");
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                max=Math.max(arr[i][j],max);
            }
        }
        System.out.println(max);
    }
}
