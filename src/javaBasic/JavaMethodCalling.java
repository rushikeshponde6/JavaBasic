package javaBasic;

public class JavaMethodCalling {
    int a=5; //Global variable
    static int c = 10;  //static variable
    public static void main(String[] args) {
        int b=10;  //Local variable
        b=20;
        System.out.println("Hey....java learner!");
        System.out.println(b);
        aMethod();
    }
    public static void aMethod(){   //User defined method
        int d = 100;
        int e = 40;
        int z = d+e;
        System.out.println(" Hello aMethod");
        System.out.println(z);
    }
}
