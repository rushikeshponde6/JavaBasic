package javaStaticPrograms;

public class Static3 {
    int rollNo;       //Declaring global variable
    String name;      //Declaring global variable
    static String college = "IIT  Bombay";   //Global variable

    //Constructor
    Static3(int r, String n){
        rollNo = r;
        name = n;
    }

    public void getResult(){
        System.out.println(rollNo + " " + name + " " + college);
    }
}
