package _8_Strings;

public class _14_stringBuilder_append {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");
        System.out.println(sb);

        sb.append(35);
        System.out.println(sb);

        sb.append('#');
        System.out.println(sb);

        char[] ch={'x','y','z'};
        sb.append(ch);
        System.out.println(sb);

        int[] arr={1,2,3};
        sb.append(arr);
        System.out.println(sb);
    }
}
