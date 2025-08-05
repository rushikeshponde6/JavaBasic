package typeCasting;

public class TypeCastingNarrowing {
    public static void main(String[] args) {
        double b = 5.7;
        int a = (int) b;  //manual casting Double->Int
        System.out.println(b);
        System.out.println(a);

        //String to Integer conversion
        String d = "10";
        int e = Integer.parseInt(d);
        System.out.println(e);

        //Integer to String Conversion
        int h = 30;
        String i = String.valueOf(h);
        System.out.println(i);


    }
}
