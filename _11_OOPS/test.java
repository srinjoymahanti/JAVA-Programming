package _11_OOPS;

//class A{
//
//    void show(){
//        System.out.println("hello");
//    }
//}
//class B extends A{
//
//    void show(){
//        System.out.println("cello");
//    }
//}
//
//class test{
//    public static void main(String[] args) {
//        A r=new B();
//        r.show();
//    }
//}

class A{
    private int value;
    public void setValue(int x){
        value=x;
    }
    public int getValue(){
        return value;
    }
}
class B{
    public static void main(String[] args) {
        A r=new A();
        r.setValue(100);
        System.out.println(r.getValue());
    }
}
