package _11_OOPS;

class A{

    void show(){
        System.out.println("hello");
    }
}
class B extends A{

    void show(){
        System.out.println("cello");
    }
}

class test{
    public static void main(String[] args) {
        A r=new B();
        r.show();
    }
}
