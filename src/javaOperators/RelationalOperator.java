package javaOperators;

public class RelationalOperator {
    public static void main(String[] args) {
        int a = 300;            //local variable
        int b = 300;            //local variable

        if(a!=b){
            System.out.println("a is not equals to b");
        } else{
            System.out.println("a is equals to b");
        }

        String p = "hello";
        String q = "HELLO";

        //String comparison - 1st way is not the correct way
        //we use == for number comparison- case-sensitive
        if (p==q){
            System.out.println("p and q are equal for first way");
        } else{
            System.out.println("p and q are NOT equal for first way");
        }

        //String comparison - 2nd way is not Appropriate- case-sensitive
        if (p.equals(q)){
            System.out.println("p and q are equal for second way");
        } else{
            System.out.println("p and q are NOT equal for second way");
        }

        //String comparison - 3rd way is the Correct way - Not case-sensitive
        if (p.equalsIgnoreCase(q)){
            System.out.println("p and q are equal for Third way");
        } else{
            System.out.println("p and q are NOT equal for Third way");
        }
    }
}
