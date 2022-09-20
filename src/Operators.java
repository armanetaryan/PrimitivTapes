public class Operators {
    public static void main(String[] args) {

        //max of numbers

        int a  = 4, b = 3, c = 6, d = 9;
        int max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;

        System.out.println("max is: " + max);


        //Triangle

        int a1 = 5;
        int b1 = 6;
        int c1 = 2;
        if (a1 + b1 > c1 && a1 + c1 > b1 && c1 + b1 > a1)
            System.out.println("with" + a1 + ", " + b1 + ", " + c1 + "is possible to make a triangle");
        else
            System.out.println("with" + a1 + ", " + b1 + ", " + c1 + "is not possible to make a triangle");


        // Checking is triangle raight triangle or not

        int slingshot = a1;
        int page1 = b1;
        int page2 = c1;
        if (b1 > slingshot)
            slingshot = b1;
        page1 = a1;
        if (c1 > slingshot)
            slingshot = c1;
        page2 = b1;
        if (page1 * page1 + page2 * page2 == slingshot * slingshot)
            System.out.println("The triangle is a right triangle");
        else
            System.out.println("The triangle is not a right triangle");



        //week days

        int date = 6;
        switch (date){
            case 1:
                System.out.println("Monday " );
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend " + "\uD83E\uDD73" + "\uD83E\uDD73" + "\uD83E\uDD73"); // run to see
                break;
            default:
                System.out.println("incorrect day number");
        }















    }
}


