package _10_2DArrays;

import java.util.Scanner;

public class _5_addTwoMatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        int[][] brr=new int[3][3];
        int[][] crr=new int[3][3];
        System.out .println("Enter the 3X3 first array:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out .println("Enter the 3X3 second array:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                brr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                crr[i][j]=arr[i][j]+brr[i][j];
            }
        }
        System.out.println("The final array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
