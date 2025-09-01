package _3_Number_Format;
import java.text.NumberFormat;
public class B_percentageInstance {
    public static void main(String[] args) {
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
    
}
