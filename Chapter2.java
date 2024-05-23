import java.util.Scanner;

public class Chapter2 {
    public static void main(String[] args) {

        /*
        //QUESTION 2.1
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = scan.nextDouble();

        double fahrenheit = (9/5d) * celsius + 32;

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
        */

        /*
        //QUESTION 2.2
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;
    //You could also round the area this way four decimal places depending on the zeros in the 100.0
       // area = Math.round(area * 10000.0) / 10000.0;
       // System.out.println(area);
        System.out.printf("The area is %.4f", area);
        System.out.println();
        System.out.printf("The volume is %.1f ", volume);
        */

        /*
        //QUESTION 2.3
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double number = scan.nextDouble();

        double meters = number * 0.305;

        System.out.println(number + " feet is " + meters + " meters");
        */

        /*
        //QUESTION 2.4
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        double kilograms = pounds * 0.454;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
        */

        /*
        //QUESTION 2.5
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = scan.nextDouble();
        double gratuityRate = scan.nextDouble();

        double gratuity = gratuityRate * 0.1;
        double total = gratuity + subtotal;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
        */

        /*
        //QUESTION 2.6*
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int rem;
        int sum = 0;

        while(number>0){
            rem = number % 10;
            sum += rem;
            number = number / 10;
        }

        System.out.println("The sum of the digits is " + sum);
        */

        /*
        //QUESTION 2.7
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = scan.nextInt();

        int hour = minutes / 60;
        int day = hour / 24;
        int years = day / 365;

        int days = day % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
        */

        /*
        //QUESTION 2.8*
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the time offset of GMT
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;
        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;
        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;
        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;
        currentHour = currentHour + offset;
        // Display results
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond);
        */

        /*
        //QUESTION 2.9
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");
        double v0 = scan.nextDouble();
        double v1 = scan.nextDouble();
        double t = scan.nextDouble();

        double avgAccel = (v1 - v0) / t;

        System.out.println("The average acceleration is " + avgAccel);
        */

        /*
        //QUESTION 2.10
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double m = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        double q = m * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed is " + q);
        */

        /*
        //QUESTION 2.11*
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of year: ");
        int years = scan.nextInt();

        int population = 312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * years);

        System.out.println("The population in "+ years + " years is " + population);
        */

        /*
        //QUESTION 2.12
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double v = input.nextDouble();
        double a = input.nextDouble();

        double length = Math.pow(v,2) / (2*a);

        System.out.println("The minimum runway length for this airplane is " + length);
        */

        /*
        //QUESTION 2.13*
        Scanner scan = new Scanner(System.in);
        final double MONTHLY_INTEREST_RATE = 0.00417;

        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = scan.nextDouble();

        double total = savingAmount * (1 + MONTHLY_INTEREST_RATE);
        total = (savingAmount + total) + (1 + MONTHLY_INTEREST_RATE);
        total = (savingAmount + total) + (1 + MONTHLY_INTEREST_RATE);
        total = (savingAmount + total) + (1 + MONTHLY_INTEREST_RATE);
        total = (savingAmount + total) + (1 + MONTHLY_INTEREST_RATE);
        total = (savingAmount + total) + (1 + MONTHLY_INTEREST_RATE);

        System.out.println("After the sixth month, the account value is " + total);
        */

        /*
        //QUESTION 2.14
        Scanner input = new Scanner(System.in);
        final double pound = 0.45359237; //one pound in kilograms
        final double inch = 0.0254; //one inch in meters

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double wKilo = weight * pound;
        double mHeight = height * inch;

        double BMI = wKilo/Math.pow(mHeight,2);

        System.out.println("BMI is " + BMI);
        */

        /*
        //QUESTION 2.15
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter three points for a triangle: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();

        double x = x2 - x1;
        double y = y2 - y1;

        double xside2 = x3 - x2;
        double yside2 = y3 - y2;

        double xside3 = x1 - x3;
        double yside3 = y1 - y3;

        double side1 = Math.sqrt( Math.pow(x,2) + Math.pow(y,2) );
        double side2 = Math.sqrt( Math.pow(xside2,2) + Math.pow(yside2,2) );
        double side3 = Math.sqrt( Math.pow(xside3,2) + Math.pow(yside3,2) );

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt( s * (s- side1) * (s-side2) * (s- side3) );

        System.out.println("The area of the triangle is " + area);
        */

        /*
        //QUESTION 2.16
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        double area = ((3*Math.sqrt(3))/2) * Math.pow(s,2);

        System.out.println("The area of the hexagon is " + area);
        */

        /*
        //QUESTION 2.17
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double t = scan.nextDouble();
        System.out.print("Enter the wind speed in miles per hour: ");
        int v = scan.nextInt();

        double WCI = 35.74 + (0.6215*t) - 35.75 * Math.pow(v,0.16) + 0.4275*t*Math.pow(v,0.16);

        System.out.println("The wind chill index is " + WCI);
        */

        /*
        //QUESTION 2.18
        System.out.println("a \t b \t pow(a,b)");
        int a = 1;
        int b = 2;
        System.out.println(a +"\t"+ b +"\t" + (int)Math.pow(a,b));
        a++;
        b++;
        System.out.println(a +"\t"+ b +"\t" + (int)Math.pow(a,b));
        a++;
        b++;
        System.out.println(a +"\t"+ b +"\t" + (int)Math.pow(a,b));
        a++;
        b++;
        System.out.println(a +"\t"+ b +"\t" + (int)Math.pow(a,b));
        a++;
        b++;
        System.out.println(a +"\t"+ b +"\t" + (int)Math.pow(a,b));
        */

        /*
        //QUESTION 2.19
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double side1 = x2 - x1;
        double side2 = y2 - y1;

        double distance = Math.sqrt( Math.pow(side1,2) + Math.pow(side2,2) );

        System.out.println("The distance between the two points is " + distance);
        */

        /*
        //QUESTION 2.20
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g, 3 for 3%): ");
        double balance = scan.nextDouble();
        double interestRate = scan.nextDouble();

        double interest = balance * (interestRate/1200);

        System.out.println("The interest is " + interest);
        */

        /*
        //QUESTION 2.21*
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        int investmentAmount = input.nextInt();
        System.out.print("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = input.nextDouble();
        monthlyInterestRate /= 1200;
        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double futureInvestmentValue = investmentAmount * Math.pow( (1 + monthlyInterestRate) , years * 12);

        System.out.println("Accumulated value is $" + futureInvestmentValue);
        System.out.println("Future value is $" + (int)(futureInvestmentValue * 100) / 100.0 ); //Display the result by division method
        System.out.printf("Future value is $%.2f", futureInvestmentValue); // Display the result using printf method
        */

        /*
        //QUESTION 2.22
        //QUESTION 2.23
        //QUESTION 2.24
        //QUESTION 2.25
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = scan.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        int hours = scan.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = scan.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fTax = scan.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double sTax = scan.nextDouble();

        double grossPay = hourlyPayRate * hours;
        double federalWithholding = grossPay * 0.2;
        double stateWithholding =  grossPay * 0.09;
        double deduction = federalWithholding + stateWithholding;
        double netPay = grossPay - deduction;

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + hourlyPayRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("\t Federal Withholding (20.0%): " + federalWithholding);
        System.out.println("\t State Withholding (9.0%): " + stateWithholding);
        System.out.println("\t Total Deduction: " + deduction);
        System.out.println("Net Pay: \t " +  netPay);
        //System.out.println("Net Pay: \t $" + (int)(netPay * 100) / 100.0 );
        */

//TO DO:
        //QUESTION 2.26
        //QUESTION 2.27


    }

}
