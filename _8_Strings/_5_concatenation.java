package _8_Strings;
public class _5_concatenation {
    public static void main(String[] args){
        String firstName="tony";
        String lastName="stark";
        String fullName=firstName+"@"+lastName;
        System.out.println(fullName);
        System.out.println(firstName.concat(lastName));
        System.out.println(firstName.concat(firstName));
        System.out.println(lastName.concat(firstName));
    }
}
