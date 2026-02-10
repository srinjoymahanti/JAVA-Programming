package _16_Recursion;

import java.util.Scanner;

public class _13_mazePath {
    public static int maze(int row,int column){
        if(row==1 || column==1) return 1;
        int rightWays=maze(row,column-1);
        int downWays=maze(row-1,column);
        return rightWays+downWays;
    }
    public static int maze2(int startRow,int startCol,int endRow,int endCol){
        if(startRow==endRow || startCol==endCol) return 1;
        int rightWays=maze2(startRow,startCol+1,endRow,endCol);
        int downWays=maze2(startRow+1,startCol,endRow,endCol);
        return rightWays+downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:");
        int m=sc.nextInt();
        System.out.print("Enter columns:");
        int n=sc.nextInt();
        //System.out.println("Possible ways to go to the end:"+maze(m,n));
        System.out.println("Possible ways to go to the end:"+maze2(1,1,m,n));
    }
}
