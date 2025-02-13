/*

Datatypes

1. primitve
------------------------------------------------------------------
    a.Integer --> Natural Numbers --> byte, short, int, long
    int ==>> 4bytes
    long ==>> 8bytes
    short ==>> 2bytes
    byte ==>> 1 byte --> 2^7 to 2^7-1 --> -128 to +127
------------------------------------------------------------------
    b.Float --> Decimal values --> double, float
    float ==>> 4 bytes
    double ==>> 8 bytes --> by default java support this

    double num = 6.5;
    float num = 6.76f;

-------------------------------------------------------------------
    c.Character --> Character values --> any 
    char ==>> 2bytes --> u work with any type of character
    it supports UNICODE 

    char c = 'k';
-------------------------------------------------------------------
    d.Boolean --> it only contains True or False

    boolean b = true;

 */

public class Datatypes {
    public static void main(String a[]) {
        int num1 = 2;
        byte by = 127;
        short sh = 558;
        long l = 65542311l;
        System.out.println(num1);
        System.out.println(by);
        System.out.println(sh);
        System.out.println(l);

        float f = 3.6f;
        double d = 4.7;
        System.out.println(f);
        System.out.println(d);

        char ch = 'f';
        System.out.println(ch);

        boolean b = true;
        System.out.println(b);

    }

}
