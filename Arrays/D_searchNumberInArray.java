package Arrays;
import java.util.Scanner;
public class D_searchNumberInArray {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the row:");
            int row=sc.nextInt();
            System.out.print("Enter the column:");
            int column=sc.nextInt();
            
            System.out.println("Enter the matrix:");
            int[][] number=new int[row][column];
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    number[i][j]=sc.nextInt();
                }
            }
            System.out.print("Enter the number for search:");
            int x=sc.nextInt();
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    if(number[i][j]==x){
                        System.out.print("The row is "+i+" and the column is "+j);
                    }
                }
                System.out.println();
            }
            sc.close();
    }
}
