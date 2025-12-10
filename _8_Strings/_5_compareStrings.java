package _8_Strings;
public class _5_compareStrings {
    public static void main(String[] args){
        String firstName="tony";
        String lastName="stark";

        //firstName>lastname : +ve value
        //firstName=lastname : 0
        //firstName<lastname : -ve value

        if(firstName.compareTo(lastName)==0){
            System.out.println("Strings are equal");
        }else System.out.println("Strings are not equal");
    }
}
