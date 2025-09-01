package _9_Arrays;
import java.util.Arrays;

public class A_basics {
    public static void main(String[] args){
        int[] numbers=new int [5];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        System.out.println(Arrays.toString(numbers));

        int[] arr={2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }
}
