package _18_OOPS;

class ComplexNumber{
    int x;
    int y;
    ComplexNumber(int x,int y){
        this.x=x;
        this.y=y;
    }
    void print(){
        if(y<0) System.out.println(x+" - "+(-y)+"i");
        else System.out.println(x+" + "+y+"i");
    }
    void add(ComplexNumber z){
        this.x=x+z.x;
        this.y=y+z.y;
    }
    void multiply(ComplexNumber z){
        this.x=x*z.x - y*z.y;
        this.y=x*z.y + y*z.x;
    }
}
public class _4_complexNumber {
    public static void main(String[] args) {
        ComplexNumber z1=new ComplexNumber(4,3);
        z1.print();
        ComplexNumber z2=new ComplexNumber(5,-7);
        z2.print();

        //z1.add(z2);
        //z1.print();

        z1.multiply(z2);
        z1.print();

    }
}
