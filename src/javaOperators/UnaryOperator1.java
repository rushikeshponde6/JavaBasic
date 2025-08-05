package javaOperators;

public class UnaryOperator1 {
    public static void main(String[] args) {
        int a = 10; //defining local variable
        System.out.println(a);     //10
        System.out.println(a++);   //10 ,11
        System.out.println(a);     //11
        System.out.println(--a);    //10, 10
        System.out.println(a++);    //10, 11
        System.out.println(++a);    //12
        System.out.println(a++);    //12, 13
        System.out.println(a);      //13
    }
}
