package javaStaticPrograms;

public class Static2 {
    int rollNo;   //Declaring Global variable
    String name;  //Declaring Global variable
    String college; //Declaring Global variable

    public static void main(String[] args) {
        Static2 s2  = new Static2();      //creating object/instance of a class
        System.out.println(s2.rollNo);   //0
        System.out.println(s2.name);     //null
        System.out.println(s2.college);  //null
    }
}
