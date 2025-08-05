package javaOOps;

public class Encapsulation1 {
    String name;        //Global variable
    int a;      //Global variable
    final int c = 2;    //Final variable

    //Final variable
    public void a(){
        //c = 5;   //Final variable cannot be change the value

    }

    // Final Method
    final void d(){
        System.out.println("final method");
    }
    public void setName(String s){
        this.name = s;
        this.a = 5;
        System.out.println(a);
        System.out.println(c);
    }
    public Object getName(){
        return name;
    }
}
