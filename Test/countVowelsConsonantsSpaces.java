package Test;

public class countVowelsConsonantsSpaces {
    public static void count(String str){
        str=str.toLowerCase();
        int vowels=0;
        int consonants=0;
        int whiteSpaces=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') vowels++;
            else if (97<(int)str.charAt(i) && (int)str.charAt(i)<=122) consonants++;
            else if(str.charAt(i)==' ') whiteSpaces++;
        }
        System.out.println("The number of vowels are "+vowels);
        System.out.println("The number of consonants are "+consonants);
        System.out.println("The number of white spaces are "+whiteSpaces);
    }
    public static void main(String[] args){
        String s="Hellow world how are you";
        count(s);
    }
}
