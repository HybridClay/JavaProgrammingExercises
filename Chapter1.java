public class Chapter1 {
    public static void main(String[] args) {

        /*
        //QUESTION 1.1
        System.out.println("Welcome to Java.\nLine breaking space to the next line");
        System.out.println("Welcome to Computer Science.");
        System.out.println("Programming is fun.");
        */

        /*
        //QUESTION 1.1 with Text in a Message Dialog Box
        JOptionPane.showMessageDialog(null,"Welcome to Java!");
        JOptionPane.showMessageDialog(null,"Welcome to Computer Science.");
        JOptionPane.showMessageDialog(null,"Programming is fun!");
        */

        /*
        //QUESTION 1.2
        for (int i = 0; i <5 ; i++) {
            System.out.println(i + " Welcome to Java");
        }
        */

        /*
        //QUESTION 1.3
        System.out.println("    J      A    V     V    A      ");
        System.out.println("    J     A A    V   V    A A     ");
        System.out.println("J   j    AAAAA    V V    AAAAA    ");
        System.out.println(" J J    A     A    V    A     A   ");
        */

        /*
        //QUESTION 1.4
        System.out.println("a   a^2   a^3");
        for (int a = 1; a <= 4; a++) {
            System.out.println(a + "   " + Math.pow(a,2) + "   " + Math.pow(a,3));
        }
        */

        /*
        //QUESTION 1.5
        System.out.println((9.5*4.5-2.5*3)/(45.5-3.5));
        //To Check your work:
        double a = 9.5*4.5;
        System.out.println(a);
        double b = 2.5*3;
        System.out.println(b);

        System.out.println(a-b);

        double d = 45.5 - 3.5;
        System.out.println(d);

        System.out.println((a-b)/d);
         */

        /*
        //QUESTION 1.6
        int result = 0;
        for (int i = 0; i <= 9; i++) {
            result += i;
        }
        System.out.println(result);
        */

        /*
        //QUESTION 1.7
        //Note: When using double or float datatype, make sure to type the d or f at the end of the number.
        //double goes up to 16 decimal places.
        //float goes up to 7 decimal digits.
        float a, b, c, d, e, f, g;
        a= 1f;
        b= 1/3f;
        c= 1/5f;
        d= 1/7f;
        e= 1/9f;
        f= 1/11f;
        g= 1/13f;

        System.out.println(4*(a-b+c-d+e-f));
        System.out.println(4*(a-b+c-d+e-f+g));

        //If we used the double datatype, the decimal answer would be longer than with the float decimal answer.
        //Also, important to add d at the end of the number b/c if not then the answer would become rounded.
        double h, i, j, k, l, m, n;
        h= 1d;
        i= 1/3d;
        j= 1/5d;
        k= 1/7d;
        l= 1/9d;
        m= 1/11d;
        n= 1/13d;

        System.out.println(4*(h-i+j-k+l-m));
        System.out.println(4*(h-i+j-k+l-m+n));
        */

        /*
        //QUESTION 1.8
        double radius = 5.5;
        System.out.println("perimeter= " + (2 * radius* Math.PI));
        System.out.println("area= " + (radius * radius * Math.PI));
        */

        /*
        //QUESTION 1.9
        double width = 4.5;
        double height = 7.9;
        System.out.println(width * height);
        System.out.println((int)width * height); //this would only int the width part but we need to do it for the whole formula
        System.out.println((int)(width * height)); //the answer should be 35.55 but with int, it would give you 35
        */

        /*
        //QUESTION 1.10
        System.out.println(14 + " kilometers is " + 14/1.6 + " miles");
        System.out.println("45 minutes and 30 seconds to Hour is: " + 45.5/60);
        System.out.println(8.75/0.7583333333333333);
        */

        /*
        //QUESTION 1.11
        System.out.println("Number of seconds in a year: " + 60 * 60 * 24 * 365);
        System.out.println("Number of births per year: " + 31536000/ 7.0);
        System.out.println("Number of deaths per year: " + 31536000/ 13.0);
        System.out.println("Number of immigrants per year: " + 31536000/ 45.0);

        System.out.println("Year\t\t\tPopulation" +
                "\n0\t\t\t\t312032486" +
                "\n1\t\t\t\t" + (312032486 + 4505142.857142857 - 2425846.153846154 + 700800.0) +
                "\n2\t\t\t\t" + (3.148125827032967E8 + 4505142.857142857 - 2425846.153846154 + 700800.0) +
                "\n3\t\t\t\t" + (3.1759267940659344E8 + 4505142.857142857 - 2425846.153846154 + 700800.0) +
                "\n4\t\t\t\t" + (3.2037277610989016E8 + 4505142.857142857 - 2425846.153846154 + 700800.0) +
                "\n5\t\t\t\t" + (3.231528728131869E8 + 4505142.857142857 - 2425846.153846154 + 700800.0)
        );
        */

        /*
        //QUESTION 1.12
        System.out.println("24 miles is: " + 24*1.6 + " kilometers");
        System.out.println("Number of hours in fraction is: " +
                ((60*60) + (40*60) + 35) / (60.0 * 60));
        System.out.println("The runner ran " + 38.400000000000006/1.676388888888889 + " kilometers per hour");
        */


    }
}

