package javaArray;

public class Array1 {
    public static void main(String[] args) {
        //Instantiation of array
        int a[] = new int[5];
        //printing the length of the array
        System.out.println(a.length);
        //Print Default values of an int array
        for(int i=0; i<5; i++){
            System.out.println(a[i]);
        }
        //Define an array
        a[0] = 34;
        a[1] = 2;
        a[2] = 345;
        a[3] = 9012;
        a[4] = 123;
        System.out.println(a[3]);  //9012
        for(int i=0; i<5; i++){
            System.out.println(a[i]);
        }
    }
}
