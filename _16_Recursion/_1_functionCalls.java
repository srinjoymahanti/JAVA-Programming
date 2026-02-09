package _16_Recursion;

public class _1_functionCalls {
    public static void mango(){
        System.out.println("I am in mango method");
    }
    public static void banana(){
        System.out.println("I am in banana method");
        mango();
    }
    public static void apple(){
        System.out.println("I am in apple method");
        banana();
    }
    public static void main(String[] args) {
        System.out.println("I am in main method");
        apple();
    }
}
