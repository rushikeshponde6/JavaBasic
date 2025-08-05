package javaOOps;

public class Inheritance4 extends Inheritance3 {
    public void multiply(int a, int b){
        c = a*b ;
        System.out.println("Multiplication is :" + c);
    }

    public static void main(String[] args) {
        int a = 20, b = 30;

        Inheritance4 i4 = new Inheritance4();
        i4.multiply(a,b);
        i4.add(a,b);
        i4.substract(a,b);
    }
}
