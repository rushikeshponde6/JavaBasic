package constructor;

public class Constructor2 {
    int id;         //Global variable
    String name;    //Global variable
    String address; //Global variable

    //Default Constructor
    Constructor2(){
        System.out.println("Hello Default constructor");
    }
    //parameterised constructor
    Constructor2(int a, String b, String c){
        this.id = a;
        name = b;
        address = c;
    }
    //Non static method
    public void displayInfo(){
        System.out.println(id + "  " + name + "  "  + address);
    }

    public static void main(String[] args) {
        //Default constructor
        Constructor2 c2 = new Constructor2();
        //parameterised Constructor
        Constructor2 c3 = new Constructor2(1, "Rushi", "Sangamner");
        c3.displayInfo();
        Constructor2 c4 = new Constructor2(2, "Pradip", "Bota Malwadi");
        c4.displayInfo();
    }
}
