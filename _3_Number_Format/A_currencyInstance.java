package _3_Number_Format;
import java.text.NumberFormat;
public class A_currencyInstance  {
    public static void main(String[] args){
        //Currency
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        String result=currency.format(1234567.891);
        System.out.println(result);

    }
}
