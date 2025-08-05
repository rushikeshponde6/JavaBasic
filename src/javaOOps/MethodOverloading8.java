package javaOOps;

public class MethodOverloading8 {
    public void sum(int a, int b){
        System.out.println(a+b);
    }
    public void sum(long a, long b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        MethodOverloading8 m8 = new MethodOverloading8();
        m8.sum(10, 5);  // Ambiguity issue resolved
        //Print A to Z using for loop
        for (char c = 'A'; c<= 'Z'; c++){
            System.out.print(c + "  ");
        }
    }


}
