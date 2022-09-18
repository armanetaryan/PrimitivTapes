public class Operators {
    public static void main(String[] args) {
        int a = 2 + 2;
        int b = a * 6;
        int c = b / 7;
        int d = c - a;
        int e = -d;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        System.out.println("d = "+ d);
        System.out.println("e = "+ e);

        double da = 8 + 8;
        double db = da * 5;
        double dc = db / 9;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da = "+ da);
        System.out.println("db = "+ db);
        System.out.println("dc = "+ dc);
        System.out.println("dd = "+ dd);
        System.out.println("de = "+ de);

        int x = 52;
        double y = 42.25;
        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);

        int a1 = 1;
        int b1 = 2;
        int c1 = 3;
        a1 += 5;
        b1 *= 4;
        c1 += a1 * b1;
        c1 %= 8;
        System.out.println("a = "+ a1);
        System.out.println("b = "+ b1);
        System.out.println("c = "+ c1);


    }
}
