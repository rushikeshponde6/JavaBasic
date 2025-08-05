package javaStaticPrograms;

public class Static7 {
    int a;     //Global variable
    String b;  //Global variable
    static int c = 4;  //Static variable

    //Static method
    public static void a(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Static7 s7 = new Static7();
        s7.a = 1;
        s7.b = "Selenium";
        c = 10;
        a();
        System.out.println(s7.a + "  " + s7.b + " - " + c);    //1  Selenium - 10
    }

}
