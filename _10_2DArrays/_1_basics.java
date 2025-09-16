package _10_2DArrays;

import java.util.Scanner;

public class _1_basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row:");
        int row=sc.nextInt();
        System.out.print("Enter the column:");
        int column=sc.nextInt();
        int[][] number=new int[row][column];
        System.out.println("Enter the matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                number[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

    }
}
