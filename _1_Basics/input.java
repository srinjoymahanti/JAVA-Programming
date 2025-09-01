package _1_Basics;
import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter Name:");
        //used to read line
        String name = sc.nextLine();

        System.out.print("RollNo:");
        //used to read int
        int RollNo = sc.nextInt(); 

        System.out.print("Marks:");
        //used to read double
        double Marks = sc.nextDouble();

        System.out.print("Grade:");
        //used to read till space
        char Grade = sc.next().charAt(0);	
 
        System.out.println("Name: "+name);
        System.out.println("Gender: "+RollNo);
        System.out.println("Marks: "+Marks);
        System.out.println("Grade: "+Grade);
        
        sc.close();
	}
}