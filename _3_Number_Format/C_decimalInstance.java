package _3_Number_Format;
import java.text.NumberFormat;

public class C_decimalInstance {
    public static void main(String[] args){
        String result=NumberFormat.getCurrencyInstance().format(1234567.891);
        System.out.println(result);
    }
    
}
