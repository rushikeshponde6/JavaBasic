package javaArray;

public class Array2 {
    public static void main(String[] args) {
        int p[] = {1,7,3445,5577};
        String q[] = {"Rushi", "Soma", "Kaustubh", "Sandip", "Ashu", "Prapdip"};
        Object r[] = {1, "Rushi", 't', 234, 'U', "SOMA", 234};

        System.out.println(p.length);
        System.out.println(q.length);
        System.out.println(r.length);


        System.out.println(p[3]);
        System.out.println(q[0]);
        System.out.println(r[2]);

        //modifying array value using index
        q[0] = "Rushikesh";
        System.out.println(q[0]);
    }
}
