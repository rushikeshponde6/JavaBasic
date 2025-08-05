package javaLoops;

public class IfElse4 {
    public static void main(String[] args) {
        int age =20;
        int weight=35;

        if(age>18){
            if(weight>50){
                System.out.println("Eligible");
            }else{
                System.out.println("Not Eligible");
            }
        }else{
            System.out.println("Age is lesser than 18");
        }
    }
}
