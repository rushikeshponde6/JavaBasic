package typeCasting;

import org.w3c.dom.ls.LSOutput;

public class TypeCastingWidening {
    public static void main(String[] args) {
        int k = 50;
        double l = k;
        System.out.println(k);      //50
        System.out.println(l);      //50.0
    }


}
