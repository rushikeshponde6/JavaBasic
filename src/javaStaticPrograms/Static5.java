package javaStaticPrograms;

public class Static5 {
    static int z = 5;    //Static variable
    int y = 1;           //Global variable

    //Static method
    public static void a(){
        z = 10;
        System.out.println(z);
    }

    //Non-Static method
    public void b(){
        z = 15;
        System.out.println(z);
        a();
    }

    public static void main(String[] args) {
        a();
        Static5 s5 = new Static5();
        s5.b();
    }

}
