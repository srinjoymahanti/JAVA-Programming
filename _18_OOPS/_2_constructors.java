package _18_OOPS;

public class _2_constructors {
    static class Student{
        private int roll;
        String name;
        float marks;
        boolean boy;
        Student(){//default constructor

        }
        Student(int x,String s,float f,boolean b){//Parameterised constructor
            this.roll=x;
            this.name=s;
            this.marks=f;
            this.boy=b;
        }
        Student(int x,String s,float f) {//Parameterised constructor
            this.roll = x;
            this.name = s;
            this.marks = f;
        }
    }
    public static void main(String[] args) {
        Student s1=new Student(143,"arya",91.11f,true);//creating using parameterised constructor
        System.out.println(s1.name);
        Student s2=new Student();//creating using default constructor
        System.out.println(s2.name);
        Student s3=new Student(200,"srinu",89.1f);//creating using parameterised constructor three arguments
        System.out.println(s3.name);
    }
}
