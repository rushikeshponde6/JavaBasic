package javaOperators;

public class LogicalOperator2 {
    public static void main(String[] args) {
        int a = 10;  //Local variable
        int b = 5;   //local variable
        int c = 20;  //local variable

        //Logical operator - if 1st condition is false, it will never check for 2nd condition.
        System.out.println(a<b && a++<c);  //false
        System.out.println(a);    //10

        //Bitwise operator- even if 1st condition is false, it will check for 2nd condition.
        System.out.println(a<b & a++<c);   //false
        System.out.println(a);     //11
    }
}
