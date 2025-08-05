package javaOOps;

public class MethodOverriding2 extends MethodOverride1 {
    public void eat(){
        System.out.println("You are eating");
    }
    public static void main(String[] args) {
        MethodOverriding2 mo2 = new MethodOverriding2();
        mo2.eat();
        //MethodOverride1 mo1 = new MethodOverride1();
        //mo1.eat();
    }
}
