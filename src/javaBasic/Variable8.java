package javaBasic;

public class Variable8 {

    int a = 6;       //Global variable
    static int b = 10;   // Static variable
    public static void main(String[] args) {
        int c = 5;    //Local variable
        Variable8 vr8 = new Variable8();

        //Non static variable calling
        System.out.println(vr8.a);

        //Static variable calling
        System.out.println(vr8.b);
        System.out.println(b);
        System.out.println(Variable8.b);
        a();
    }

    public static void a(){
        int f=30;
        System.out.println(f);
    }

}




