package _8_Strings;

public class _15_insertAndDelete {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("AbcMnoXyz");
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.delete(3,6);
        System.out.println(sb);
        sb.insert(2,'9');
        System.out.println(sb);
    }
}
