package _18_OOPS;

class Student{
    private int roll;
    String name;
    float marks;
    boolean boy;
    int getRoll(){
        return roll;
    }
    void setRoll(int x){
        roll=x;
    }
}
public class _1_userDefinedDataType {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="srinjoy";
        s1.setRoll(143);
        s1.boy=true;
        s1.marks=91.27f;
        System.out.println(s1.getRoll());
    }
}
