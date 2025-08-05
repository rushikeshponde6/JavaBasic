package javaOOps;

public class Inheritance10 extends Inheritance8{
    public void run(){
        System.out.println("I'm running");
    }

    public static void main(String[] args) {
        Inheritance10 i10 = new Inheritance10();
        i10.eat();
        i10.run();
    }
}

//This is Hierarchical inheritance where Inheritance8 is associated with Inheritance9 and inheritance10
//But Inheritance9 and Inheritance10 are not associated to each other.
