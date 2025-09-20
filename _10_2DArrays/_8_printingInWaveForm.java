package _10_2DArrays;

import java.util.Scanner;

public class _8_printingInWaveForm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][2];
        int m=arr.length;
        int n=arr[0].length;
        System.out .println("Enter the array:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
//        //row wise printing
//        System.out.println("Printing in wave form:");
//        for(int i=0;i<m;i++){
//            if(i%2==0){
//                for(int j=0;j<n;j++){
//                    System.out.print(arr[i][j]+" ");
//                }
//            }
//            else{
//                for(int j=n-1;j>=0;j--){
//                    System.out.print(arr[i][j]+" ");
//                }
//            }
//        }

        //column wise printing
        int[][] transpose=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j]=arr[j][i];
            }
        }
        System.out.println("Printing in column wise wave form:");
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<m;j++){
                    System.out.print(transpose[i][j]+" ");
                }
            }
            else{
                for(int j=m-1;j>=0;j--){
                    System.out.print(transpose[i][j]+" ");
                }
            }
        }
    }
}
