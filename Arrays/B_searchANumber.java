package Arrays;
import java.util.Scanner;
public class  B_searchANumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of array:");
            int size=sc.nextInt();
            int[] number=new int[size];
            for(int i=0;i<size;i++){
                System.out.print("Enter the "+(i+1)+"th array:");
                number[i]=sc.nextInt();
            }
            System.out.print("Enter the no for search:");
            int x=sc.nextInt();
            for(int i=0;i<number.length;i++){
                if(number[i]==x){
                    System.out.print("The index of "+x+" is "+i);
                }
            }
            sc.close();
        }
}
