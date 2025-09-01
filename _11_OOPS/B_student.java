package _11_OOPS;
class Student{
        String name;
        int age;
        double height;
        final String collegeName = "IIT"; //final variable

    //Constructor
    Student(String name, int age, double height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    }
public class B_student {
    public static void main(String args[]){
        Student s1= new Student("arya",21,190);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.height);
    }
}