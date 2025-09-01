package _1_Basics;
public class E_casting {
    public static void main(String args[]){
        double x=1.1;

        //Implicit casting
        double y=x+2;
        System.out.println(y);
        
        //Explicit casting
        //int z= x+2; //Error
        int z= (int)x+2;
        System.out.println(z);
        
        //String to int
        String a="1";
        System.out.println(Integer.parseInt(a)+2);
        
        //String to double
        String c="1.1";
        double d=Double.parseDouble(c)+2;
        System.out.println(d);
        
        //int to String
        int e=3;
        String f=String.valueOf(e);
        System.out.println(f);
    }
    
}
