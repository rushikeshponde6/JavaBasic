package javaStaticPrograms;

public class Static1 {

    int a = 300;        //Global variable
    String s = "Hello";   //Global variable
    static int b = 200;  //Static variable

    //Static method
    public static void method1(){
        String c = "Hi"; //Local variable
        System.out.println(c);  //Calling c variable
    }

    //Non-Static method
    public void method2(){
        int i=100; //local variable
    }
}
