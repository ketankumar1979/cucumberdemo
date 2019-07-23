package Encapsulationdemo;

public class Encapsulation1 {
    private int a,b,c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public static void main ( String []args ){
        Encapsulation1 obj = new Encapsulation1();
        obj.setA(10);
        obj.setB(20);
        obj.setC(30);
        System.out.println(obj.getA());
        System.out.println(obj.getB());
        System.out.println(obj.getC());

    }
}
