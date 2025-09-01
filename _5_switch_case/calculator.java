package _5_switch_case;
import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();

        System.out.print("Enter second number:");
        int b=sc.nextInt();

        System.out.println("Press 1 for add");
        int add=a+b;

        System.out.println("Press 2 for subtract");
        int subtract=a-b;

        System.out.println("Press 3 for multiply");
        int multiply=a*b;

        System.out.println("Press 4 for devide");
        int devide=a/b;

        System.out.println("Press 5 for remainder");
        int remainder=a%b;

        System.out.print("Enter button no:");
        int button=sc.nextInt();
        switch(button){
            case 1:System.out.print("Result is:"+add);
            break;
            case 2:System.out.print("Result is:"+subtract);
            break;
            case 3:System.out.print("Result is:"+devide);
            break;
            case 4:System.out.print("Result is:"+multiply);
            break;
            case 5:System.out.print("Result is:"+remainder);
            break;
        }
        sc.close();
    }
}
