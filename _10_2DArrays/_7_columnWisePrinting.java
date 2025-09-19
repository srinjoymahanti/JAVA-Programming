package _10_2DArrays;

import java.util.Scanner;

public class _7_columnWisePrinting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][2];
        int m=arr.length;
        int n=arr[0].length;
        System.out .println("Enter the matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The metrix is:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Column wise printing:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
