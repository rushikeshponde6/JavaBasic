package javaBasic;

public class Variable3_Array {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,20,100}; //Integer type Array
        String b[] = {"Rushi", "Pradip", "Shandi", "Kaustubh", "Soma", "Ashu"};  //String type array
        System.out.println(a[0]);
        System.out.println(b[4]);
        System.out.println(a[10]);
        System.out.println(b[0]);
        System.out.println(b[5]);
        System.out.println(a[6]);

        //Object type Array(Combination)
        Object c[] = {1,5,"Soma", 'Y', "Sandi", 108, 'R', 12767255, "Pradip"};
        System.out.println(c[3]);
        System.out.println(c[7]);
        System.out.println(c[4]);
    }
}
