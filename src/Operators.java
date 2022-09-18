public class Operators {
    public static void main(String[] args) {
        int a = 3; // 0 + 2 + 1 or 0011 in binary
        int b = 6; // 4 + 2 + 0 or 0110 in binary
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a | b) | (a & ~b);
        int g = ~a & 0x0f;


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a|b = " + c);
        System.out.println("a&b = " + d);
        System.out.println("a^b = " + e);
        System.out.println("a|b | a&~b = " + f);
        System.out.println("~a = " + g);

        byte a1 = 64,b1;
        int i;
        i = a1 << 2;
        b1 = (byte) (a1 << 2);
        System.out.println("Original value of a1:"+ a1);
        System.out.println("i and b1: "+ i + "" + b1);

        boolean a2 = true;
        boolean b2 = false;
        boolean c2 = a2 | b2;
        boolean d2 = a2 & b2;
        boolean e2 = a2 ^ b2;
        boolean f2 = (!a2 & b2) | (a2 & !b2 );
        boolean g2 = !a2;

        System.out.println();
        System.out.println("a2 = "+ a2);
        System.out.println("b2 = "+ b2);
        System.out.println("a2 | b2 = "+ c2);
        System.out.println("a2 & b2 = "+ d2);
        System.out.println("a2 ^ b2 = "+ e2);
        System.out.println("!a2&b2|a2&!b2 = "+ f2);
        System.out.println("!a2 = "+ g2);






    }
}
