package constructor;

public class Constructor3 {
    //Constructor Overloading
    Constructor3(){
        System.out.println("No Arg constructor");
    }
    Constructor3(int a){
        System.out.println("Int Arg Constructor");
    }
    Constructor3(String b){
        System.out.println("String Arg Constructor");
    }

    public static void main(String[] args) {
        Constructor3 con3 = new Constructor3();
        Constructor3 con4 = new Constructor3(1);
        Constructor3 con5 = new Constructor3("Hello");
    }
}
