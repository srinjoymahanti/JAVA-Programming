package _10_2DArrays;

import java.util.Scanner;

public class _5_addTwoMatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        System.out .println("Enter the 3X3 first array:");
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out .println("Enter the 3X3 second array:");
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }

    }
}
