package _11_OOPS;

public class studentClass {
    public static void main(String[] args) {
        Student s1 = new Student("Srinjoy", 20, 5.8);
        //s1.collegeName = "IIT"; //Error: cannot assign a value to final variable collegeName
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.height);
       
    }
    
}
