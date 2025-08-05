package javaOperators;

public class UnaryOperator2 {
    public static void main(String[] args) {
        int a = 5;    // Defining local variable
        int b = 10;   // Defining local variable
        System.out.println(a++);          // 5, 6  = 5
        System.out.println(a++  +  ++a);  //6, 7, 8, 8 =14
        System.out.println(a  +  a++);    //8, 8, 8, 9 = 16
        System.out.println(b++  +  b--);  //10, 11, 11, 10 = 21
        System.out.println(b);            //10 =10
    }
}
