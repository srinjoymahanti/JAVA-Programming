package _10_2DArrays;

import java.util.Scanner;

public class _9_printingInSpiralForm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][3];
        int m=arr.length;
        int n=arr[0].length;
        System.out .println("Enter the array:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int MinR=0,MaxR=m-1,MinC=0,MaxC=n-1;
        while(MinR<=MaxR && MinC<=MaxC){
            //left to right
            for(int j=MinC;j<=MaxC;j++){
                System.out.print(arr[MinR][j]+" ");
            }
            MinR++;
            if(MinR>MaxR || MinC>MaxC) break;
            //top to bottom
            for(int i=MinR;i<=MaxR;i++){
                System.out.print(arr[i][MaxC]+" ");

            }
            MaxC--;
            if(MinR>MaxR || MinC>MaxC) break;

            //right to left
            for(int j=MaxC;j>=MinC;j--){
                System.out.print(arr[MaxR][j]+" ");

            }
            MaxR--;
            if(MinR>MaxR || MinC>MaxC) break;

            //bottom to top
            for(int i=MaxR;i>=MinR;i--){
                System.out.print(arr[i][MinC]+" ");

            }
            MinC++;

        }
    }
}
