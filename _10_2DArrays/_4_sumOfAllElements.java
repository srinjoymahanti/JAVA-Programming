package _10_2DArrays;

import java.util.Scanner;

public class _4_sumOfAllElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][2];
        System.out .println("Enter the array:");
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("The sum of all elements are:"+sum);
    }
}
