package _8_Strings;

public class _11_equals {
    public static void main(String[] args) {
        String s="abcxyz";
        String a="abcxyz";
        String c="abc";
        c+="xyz";//c="abcxyz"

        System.out.println(s==a);
        System.out.println(s==c);

        System.out.println(s.equals(c));
    }
}
