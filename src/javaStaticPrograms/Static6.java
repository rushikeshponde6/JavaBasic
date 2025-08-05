package javaStaticPrograms;

public class Static6 {
    int x = 10;      //Global variable
    static int y = 5;  //Static variable

    //Non-Static method
    public void a(){
        int z = 10;      //Local variable
        System.out.println(z);  //10
    }

    static int b = 6; //Static variable

    //Static method
    public static void b(){
        int a =5;    //Local variable
        System.out.println(a);  // 5
    }

    public static void main(String[] args) {
        Static6 s6 = new Static6();
        s6.a();
        System.out.println(s6.b);        // Not appropriate way
        System.out.println(Static6.b);   // Appropriate way
        System.out.println(b);           // Correct way
    }
}
