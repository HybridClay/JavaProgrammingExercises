import jdk.jshell.SourceCodeAnalysis;

import javax.swing.*;
import java.lang.invoke.StringConcatFactory;
import java.time.Month;
import java.util.Random;
import java.util.Scanner;

public class Chapter3 {
    public static void main(String[] args) {

        /*
        //QUESTION 3.1
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double root = Math.pow(b,2) - (4 * a * c);
        double rootSquared = Math.sqrt(root);

        if(root > 0){
            double r1 =   (-b + rootSquared)  / (2 * a);
            double r2 =  (-b - rootSquared) / (2 * a);
            System.out.println("The roots are " + r1 + " " + r2);
        }
        else if (root == 0) {
            double r1 = (-b + rootSquared) / (2 * a);
            System.out.println("The root is " + (int)r1);
        }
        else{
            System.out.println("The equation has no real roots");
        }
        */

        /*
        //QUESTION 3.2
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        int number3 = (int)(System.currentTimeMillis() * 3 % 10);

        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + (number1 + number2 + number3 == answer));
        */

        /*
        //QUESTION 3.3
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double e = scan.nextDouble();
        double f = scan.nextDouble();

        if ( (a*d) - (b*c) == 0){
            System.out.println("The equation has no solution");
            System.exit(0); //Note: important to have this line to finish the program, if not then it will move on to the next lines of code
        }

        double x = (e*d - b*f) / (a*d - b*c);
        double y = (a*f - e*c) / (a*d - b*c);

        System.out.println("x is " + x + " and y is " + y);
        */

        /*
        //QUESTION 3.4
        Scanner input = new Scanner(System.in);

        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);

        System.out.print("What is the sum of " + num1 + " + " + num2 + "? ");
        int answer = input.nextInt();

        if(num1 + num2 == answer){
            System.out.println("That is correct!");
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        }
        else{
            System.out.println(num1 + " + " + num2 + " = " + answer + " is " + (num1 + num2 == answer));
        }
        */
        
        /*
        //QUESTION 3.5
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int dayOfWeek = scan.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = scan.nextInt();


        String day = null;
        if(dayOfWeek == 0){
            day = "Sunday";

        }
        else if (dayOfWeek == 1){
            day = "Monday";

        }
        else if (dayOfWeek == 2){
            day = "Tuesday";
        }
        else if (dayOfWeek == 3){
            day = "Wednesday";
        }
        else if (dayOfWeek == 4) {
            day = "Thursday";
        }
        else if(dayOfWeek == 5){
            day = "Friday";
        }
        else if(dayOfWeek == 6){
            day = "Saturday";
        }

        int futureDay = dayOfWeek + elapsed;
        if(futureDay > 6){
            futureDay %= 7;
        }

        String someDate = null;
        if(futureDay == 0){
            someDate = "Sunday";

        }
        else if (futureDay == 1){
            someDate = "Monday";

        }
        else if (futureDay == 2){
            someDate = "Tuesday";
        }
        else if (futureDay == 3){
            someDate = "Wednesday";
        }
        else if (futureDay == 4) {
            someDate = "Thursday";
        }
        else if(futureDay == 5){
            someDate = "Friday";
        }
        else if(futureDay == 6){
            someDate = "Saturday";
        }

        System.out.println("Today is " + day + " and the future day is " + someDate);
        */

        /*
        //QUESTION 3.6
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInInches = (feet*12) + inches;
        double heightInMeters = METERS_PER_INCH * heightInInches;
        double bmi = weightInKilograms / Math.pow(heightInMeters,2); //Metric BMI= weight(kg) / [height(m)]^2

        System.out.println("BMI is: " + bmi);

        if(bmi < 18.5){
            System.out.println("Underweight");
        }
        else if(bmi < 25){
            System.out.println("Normal");
        }
        else if (bmi < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
        */

        /*
        //QUESTION 3.7
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an amount, for example, 11.56: ");
        double amount = scan.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");

        if(numberOfOneDollars == 1){
            System.out.println("    " + numberOfOneDollars + " dollar");
        }
        else if (numberOfOneDollars > 1) {
            System.out.println("    " + numberOfOneDollars + " dollars");
        }

        if(numberOfQuarters == 1){
            System.out.println("    " + numberOfQuarters + " quarter");
        }
        else if (numberOfQuarters > 1) {
            System.out.println("    " + numberOfQuarters + " quarters");
        }

        if(numberOfDimes == 1){
            System.out.println("    " + numberOfDimes + " dime");
        }
        else if (numberOfDimes > 1) {
            System.out.println("    " + numberOfDimes + " dimes");
        }

        if(numberOfNickels == 1){
            System.out.println("    " + numberOfNickels + " Nickel");
        }
        else if (numberOfNickels > 1) {
            System.out.println("    " + numberOfNickels + " Nickels");
        }

        if(numberOfPennies == 1){
            System.out.println("    " + numberOfPennies + " penny");
        }
        else if (numberOfPennies > 1) {
            System.out.println("    " + numberOfPennies + " pennies");
        }
        */

        /*
        //QUESTION 3.8*
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int temp = 0;
        if (num2 < num1 || num3 < num1){
            if (num2 < num1){
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if( num3 < num1) {
                temp = num1;
                num1 = num3;
                num3 = temp;
            }
        }
        if (num3 < num2){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println(num1 + " " + num2 + " " + num3);
        */

        /*
        //QUESTION 3.9
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = scan.nextInt();


        int d1 = isbn / 100000000;
        int remainingDigit = isbn % 100000000;
        int d2 = isbn / 10000000;
        remainingDigit %= 10000000;
        int d3 = remainingDigit / 1000000;
        remainingDigit %= 1000000;
        int d4 = remainingDigit / 100000;
        remainingDigit %= 100000;
        int d5 = remainingDigit / 10000;
        remainingDigit %= 10000;
        int d6 = remainingDigit / 1000;
        remainingDigit %= 1000;
        int d7 = remainingDigit / 100;
        remainingDigit %= 100;
        int d8 = remainingDigit / 10;
        remainingDigit %= 10;
        int d9 = remainingDigit;

        int d10 = ( (d1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9) ) % 11;

        if(d10 == 10){
            System.out.println(d10);
            System.out.println("The ISBN-10 number is " + isbn + "X");
        }
        else {
            System.out.println("The ISBN-10 number is " + isbn + d10);
        }
        */

        /*
        //QUESTION 3.10
        Scanner input = new Scanner(System.in);

        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        if(number1 + number2 == answer){
            System.out.println("You are correct!");
        }
        else {
            System.out.println("Your answer is wrong \n" + number1 + " + " + number2 + " is " + (number1 + number2));
        }
        */

        /*
        //QUESTION 3.11*
        Scanner input = new Scanner(System.in);

        int number_Of_Days_In_Month = 0;
        String MonthOfName = "";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month){
            case 1:
                MonthOfName = "January";
                number_Of_Days_In_Month = 31;
                break;
            case 2:
                    MonthOfName = "February";
                    if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                        number_Of_Days_In_Month = 29;
                    }
                    else {
                        number_Of_Days_In_Month = 28;
                    }
                    break;
            case 3:
                MonthOfName = "March";
                number_Of_Days_In_Month = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_Days_In_Month = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_Days_In_Month = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_Days_In_Month = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_Days_In_Month = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_Days_In_Month = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_Days_In_Month = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_Days_In_Month = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_Days_In_Month = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_Days_In_Month = 31;
        }
        System.out.println(MonthOfName + " " + year + " has " + number_Of_Days_In_Month + " days\n");
        */

        /*
        //QUESTION 3.12
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scan.nextInt();

        if( (number % 5 == 0) && (number % 6 == 0)){
            System.out.println(number + " is divisible by both 5 and 6");
        }
        else if( (number % 5 == 0) || (number % 6 == 0)){
            System.out.println(number + " is divisible by 5 or 6, but not both");
        }
        else {
            System.out.println(number + " is not divisible by either 5 or 6");
        }
        */

        /*
        //QUESTION 3.13*
        Scanner input = new Scanner(System.in);

        System.out.print("(0-single filer, 1-married jointly or qualifying widow(er), " +
                "2-married separately, 3-head of household)\n" +
                "Enter the filing status: ");
        int status = input.nextInt();

        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        double tax = 0;

        if(status == 0){
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            else if (income <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
                        + (income - 171550) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
                        + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
        }
        else if (status == 1) {
            if (income <= 16700)
                tax = income * 0.10;
            else if (income <= 67900)
                tax = 16700 * 0.10 + (income - 16700) * 0.15;
            else if (income <= 137050)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
            else if (income <= 208850)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
            else if (income <= 372950)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
                        + (income - 208850) * 0.33;
            else
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
                        + (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
        } else if (status == 2) {
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 68525)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            else if (income <= 104425)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
            else if (income <= 186475)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
                        + (income - 104425) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
                        + (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
        } else if (status == 3) {
            if (income <= 11950)
                tax = income * 0.10;
            else if (income <= 45500)
                tax = 11950 * 0.10 + (income - 11950) * 0.15;
            else if (income <= 117450)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
            else if (income <= 190200)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
            else if (income <= 372950)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
                        + (income - 190200) * 0.33;
            else
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
                        + (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
        } else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }

        System.out.println("Tax is " + (int) (tax * 100) / 100.0);
        */


        //QUESTION 3.14 (2 ways)
        /*
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int coin = random.nextInt(2);

        System.out.print("Enter 0 for heads or  1 for tails? ");
        int guess = input.nextInt();

        if(guess == coin){
            System.out.println("Coin flip was: " + coin);
            System.out.println("Your guess was " + guess);
            System.out.println("Your guess is correct!");
        }
        else{
            System.out.println("Coin flip was: " + coin);
            System.out.println("Your guess was " + guess);
            System.out.println("Your guess is incorrect :( ");
        }
        */
        /*
        Scanner input = new Scanner(System.in);

        int coin = (int)(Math.random() * 2);

        System.out.print("Enter heads or tails? ");
        String guess = input.nextLine();

        String flip = "";
        if(coin == 0 && guess.equals("heads")){
            flip = "heads";
        }
        else if (coin == 1){
            flip = "tails";
        }

        if(flip.equals(guess)){
            System.out.println("Coin flip was: " + coin);
            System.out.println("Your guess was " + guess);
            System.out.println("You are correct!");
        }
        else {
            System.out.println("Coin flip was: " + coin);
            System.out.println("Your guess was " + guess);
            System.out.println("Incorrect :(");
        }
        */

        /*
        //QUESTION 3.15
        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random() * 1000);

        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        // Extract digits from lottery
        int lotteryDigit1 = lottery / 100;
        int remainingDigitz = lottery % 100;
        int lotteryDigit2 = remainingDigitz / 10;
        int lotteryDigit3 = remainingDigitz % 10;

        // Extract digits from guess
        int guessDigit1 = guess / 100;
        int remainingDigits = guess % 100;
        int guessDigit2 = remainingDigits / 10;
        int guessDigit3 = remainingDigits % 10;

        System.out.println("The lottery number is " + lottery);
        System.out.println(lotteryDigit1);
        System.out.println(lotteryDigit2);
        System.out.println(lotteryDigit3);
        System.out.println("-----");
        System.out.println(guessDigit1);
        System.out.println(guessDigit2);
        System.out.println(guessDigit3);

        // Check the guess
        if (guess == lottery){
            System.out.println("Exact match: you win $10,000");
        }
        else if(guessDigit3 == lotteryDigit1
                && guessDigit2 == lotteryDigit2
                && guessDigit1 == lotteryDigit3){
            System.out.println("Match all digits: you win $3,000");
        }
        else if(guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit1 == lotteryDigit3
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2
                || guessDigit2 == lotteryDigit3
                || guessDigit3 == lotteryDigit1
                || guessDigit3 == lotteryDigit2
                || guessDigit3 == lotteryDigit3){
            System.out.println("Match one digit: you win $1,000");
        }
       else{
            System.out.println("Sorry, no match");
        }
        */

        /*
        //QUESTION 3.16
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
        System.out.println(Character.toUpperCase(c));
        System.out.println("---");
        //instructions say to use Math.random() and in uppercase letter so:
        int character = (int)(Math.random() * 27); //0-26
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i = 0; i < letters.length ; i++){
            System.out.println(letters[i]);
        }
        System.out.println("-----The above loops through the array of letters and prints each character---");
        System.out.println(letters[character]); //prints a letter from the array from a random index number
        System.out.println("----We would like to capitalize the letter---");//Note: we could've just capitalize the letters in the array too
        char letterCaps = Character.toUpperCase(letters[character]);
        System.out.println(letterCaps);
        */

        /*
        //QUESTION 3.17
        Scanner scan = new Scanner(System.in);

        int rps = (int)(Math.random()*4); //0-3

        System.out.print("scissor (0), rock (1), paper(2): ");
        int choice = scan.nextInt();

        if(rps == 0 && choice == 2){
            System.out.println("The computer is scissor. You are paper.");
            System.out.println("The computer won");
        }
        else if(rps == 0 && choice == 1){
            System.out.println("The computer is scissor. You are rock.");
            System.out.println("YOU WON!");
        }
        else if (rps == 1 && choice == 0) {
            System.out.println("The computer is rock. You are scissor.");
            System.out.println("The computer won");
        }
        else if (rps == 1 && choice == 2) {
            System.out.println("The computer is rock. You are paper.");
            System.out.println("YOU WON!");
        }
        else if (rps == 2 && choice == 0 ) {
            System.out.println("The computer is paper. You are scissor.");
            System.out.println("YOU WON!");
        }
        else if (rps == 2 && choice == 1) {
            System.out.println("The computer is paper. You are rock");
            System.out.println("The computer won");
        }
        else if (rps == 0 && choice == 0){
            System.out.println("The computer is scissor. You are scissor too. It is a draw");
        }
        else if (rps == 1 && choice == 1){
            System.out.println("The computer is rock. You are rock too. It is a draw");
        }
        else if (rps == 2 && choice == 2){
            System.out.println("The computer is paper. You are paper too. It is a draw");
        }
        else{
            System.out.println(choice + " is not one of the choices");
        }
        */

        /*
        //QUESTION 3.18
        String yearString = JOptionPane.showInputDialog("Enter a year");
        int year = Integer.parseInt(yearString);

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        String output = year + " is a leap year? " + isLeapYear;
        JOptionPane.showMessageDialog(null, output);

        System.exit(0);
         */

        /*
        //QUESTION 3.19
        Scanner input = new Scanner(System.in);

        System.out.print("Give me three edges of a triangle: ");
        double e1 = input.nextDouble();
        double e2 = input.nextDouble();
        double e3 = input.nextDouble();

        double perimeter = e1 + e2 + e3;

        if( (e1 + e2 >= e3) && (e1 + e3 >= e2 && e2 + e3 >= e1)){
            System.out.println("The perimeter of the triangle is: " + perimeter);
        }
        else{
            System.out.println("The input is invalid.");
        }
        */

        /*
        //QUESTION 3.20
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double t = scan.nextDouble();
        System.out.print("Enter the wind speed greater than or equal to 2: ");
        int v = scan.nextInt();

        if(t < 41 && t > -58 && v >= 2){
            double WCI = 35.74 + (0.6215*t) - 35.75 * Math.pow(v,0.16) + 0.4275*t*Math.pow(v,0.16);
            System.out.println("The wind chill index is " + WCI);
        }
        else{
            System.out.println("The temperature and/or wind speed is invalid");
        }
        */

        /*
        //QUESTION 3.21*
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year, month, and day of the month.
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int dayOfMonth = input.nextInt();

        // Convert January and February to months 13 and 14 of the previous year
        if (month == 1 || month == 2)
        {
            month = (month == 1) ? 13 : 14; //this says if month is 1 then its 13, else its 14.
            year--;
        }

        // Calculate day of the week using formula
        int dayOfWeek = (dayOfMonth + (26 * (month + 1)) / 10 + (year % 100)
                + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;

        // Display result
        System.out.print("Day of the week is ");
        switch(dayOfWeek)
        {
            case 0: System.out.println("Saturday"); break;
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday");
        }
        */

        /*
        //QUESTION 3.22
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        int xPoint = x - 0;
        int yPoint = y - 0;

        int point = (int)Math.sqrt( Math.pow(xPoint,2) + Math.pow(yPoint,2) );

        if(point <= 10 ){
            System.out.println("Point (" + x +", " + y + ") is in the circle" );
        }
        else {
            System.out.println("Point (" + x +", " + y + ") is not in the circle" );
        }
        */

        /*
        //QUESTION 3.23
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        int x = input.nextInt();
        int y = input.nextInt();

        int xPoint = x - 0;
        int yPoint = y - 0;

        int point = (int)Math.sqrt( Math.pow(xPoint,2) + Math.pow(yPoint,2) );

        int horizontal = 10 / 2;   //NOTE: if you had it as   double=(double)10/2 it would give you 5.0
        int verticle = (int) 5.0 / 2;   //NOTE: if you had it as   double verticle = 5.0 / 2; it would output 2.5

        System.out.println(verticle);
        if(point <= horizontal && point <= verticle){
            System.out.println("Point (" + (double)x +", " + (double)y + ") is in the rectangle");
        }
        else{
            System.out.println("Point (" + (double)x +", " + (double)y + ") is not in the rectangle");
        }
        */

        /*
        //QUESTION 3.24*
        // Generate a random integer 1 - 13
        int rank = (int)((Math.random() * (14 - 1)) + 1); //14-1 is 13, and we add plus 1 to start from 1 through 13.

        // Generate a random integer 1 - 4
        int suit = (int)(Math.random() * 4); //This generates numbers 0 through 3. (0 1 2 3 is 4 indexes)

        // Display card picked from deck
        System.out.print("The card you picked is ");
        switch(rank) // Get rank
        {
            case 1: System.out.print("Ace"); break;
            case 2: System.out.print(rank); break;
            case 3: System.out.print(rank); break;
            case 4: System.out.print(rank); break;
            case 5: System.out.print(rank); break;
            case 6: System.out.print(rank); break;
            case 7: System.out.print(rank); break;
            case 8: System.out.print(rank); break;
            case 9: System.out.print(rank); break;
            case 10: System.out.print(rank); break;
            case 11: System.out.print("Jack"); break;
            case 12: System.out.print("Queen"); break;
            case 13: System.out.print("King");
        }
        System.out.print(" of ");
        switch (suit) // Get suit
        {
            case 0: System.out.println("Clubs"); break;
            case 1: System.out.println("Diamonds"); break;
            case 2: System.out.println("Hearts"); break;
            case 3: System.out.println("Spades");
        }
        */

        /*
        //QUESTION 3.25
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 4 points (x1, y1, x2, y2, x3, y3, x4, y4): ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();
        double x4 = scan.nextDouble();
        double y4 = scan.nextDouble();

        double a = y1 - y2;
        double b = x1 - x2;
        double c = y3 - y4;
        double d = x3 - x4;
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        double determinant = (a*d) - (b*c);

        if (determinant > 0) {
            double x = (e*d - b*f) / determinant;
            double y = (a*f - e*c) / determinant;
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }
        else{
                System.out.println("The equation has no solution, so the two lines are parallel");

        }
        */

        /*
        //QUESTION 3.26
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter an integer: ");
        int number = input.nextInt();

        System.out.println("Is " + number + " divisible by 5 and 6? " + ( (number % 5 == 0) && (number % 6 == 0) ) );

        System.out.println("Is " + number + " divisible by 5 or 6? " + ( (number % 5 == 0) || (number % 6 == 0) ) );

        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + ( (number % 5 == 0) ^ (number % 6 == 0) ) );
        */

        /*
        //QUESTION 3.27*
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        double intersectx = (-x * (200 * 100)) / (-y * 200 - x * 100);
        double intersecty = (-y * (200 * 100)) / (-y * 200 - x * 100);

        System.out.println("The point " + ( (x > intersectx || y > intersecty) ? "is not " : "is " ) + "in the triangle");
        */

        /*
        //QUESTION 3.28*
        Scanner input = new Scanner(System.in);	// Create Scanner object

        // Prompt the user to enter the center x, y coordinates,
        // width, and height of two rectangles
        System.out.print("Enter r1's center x-, y-coordinates, width and height: ");
        double r1x = input.nextDouble();
        double r1y = input.nextDouble();
        double r1Width = input.nextDouble();
        double r1Height = input.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, width and height: ");
        double r2x = input.nextDouble();
        double r2y = input.nextDouble();
        double r2Width = input.nextDouble();
        double r2Height = input.nextDouble();

        // Determine whether the second rectangle is inside the first
        if	((Math.pow(Math.pow(r2y - r1y, 2), .05) + r2Height / 2 <= r1Height / 2) &&
                (Math.pow(Math.pow(r2x - r1x, 2), .05) + r2Width / 2 <= r1Width / 2) &&
                (r1Height / 2 + r2Height / 2 <= r1Height) &&
                (r1Width / 2 + r2Width / 2 <= r1Width))
            System.out.println("r2 is inside r1");
        else if ((r1x + r1Width / 2 > r2x - r2Width) ||
                (r1y + r1Height / 2 > r2y - r2Height))
            System.out.println("r2 overlaps r1");
        else
            System.out.println("r2 does not overlap r1");
        */

        /*
        //QUESTION 3.29
        Scanner input = new Scanner(System.in); 	// Create a new Scanner

        // Prompt the user to enter the center coordinates and radii of two circles
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        if (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))
                <= Math.abs(r1 - r2))
            System.out.println("circle2 is inside circle1");
        else if (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))
                <= r1 + r2)
            System.out.println("circle2 overlaps circle1");
        else
            System.out.println("circle2 does not overlap circle1");
        */

        /*
        //QUESTION 3.30*
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
        System.out.println(
                "Current time is " + ((currentHour > 12) ? currentHour - 12 :
                        currentHour) + ":" + currentMinute + ":" + currentSecond +
                        ((currentHour > 12) ? " PM" : " AM"));
         */

        /*
        //QUESTION 3.31
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = scan.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convertNum = scan.nextInt();

        if(convertNum == 0){
            System.out.print("Enter the dollar amount: ");
            int dollarAmount = scan.nextInt();
            double yuan = rate * dollarAmount;
            System.out.println("$"+(double)dollarAmount + " is " + yuan + " yuan" );
        }
        else if(convertNum == 1){
            System.out.print("Enter the RMB amount: ");
            double rmbAmount = scan.nextInt();
            double dollar = rmbAmount / rate;
            System.out.println(rmbAmount + " yuan is $" + dollar);
        }
        else{
            System.out.println("Incorrect input");
        }
        */

        /*
        //QUESTION 3.32
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double pointPosition = (x1 - x0)*(y2-y0) - (x2 - x0)*(y1 - y0);

        if(pointPosition < 0){
            System.out.println("p2 is on the right side of the line");
        }
        else if(pointPosition == 0){
            System.out.println("p2 is on the same line");
        }
        else if (pointPosition > 0) {
            System.out.println("p2 is on the left side of the line");
        }
        */

        /*
        //QUESTION 3.33
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double weight1 = scan.nextDouble();
        double price1 = scan.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = scan.nextDouble();
        double price2 = scan.nextDouble();

        double package1Price = weight1 * price1;
        double package2Price = weight2 * price2;

        if (package1Price > package2Price){
            System.out.println("Package 1: " + package1Price + "\n Package 2: " + package2Price);
            System.out.println("Package 2 has a better price");
        }
        else if (package1Price < package2Price) {
            System.out.println("Package 1 has a better price");
        }
        else{
            System.out.println("Package 1 and Package 2 have the same price");
        }
        */

        /*
        //QUESTION 3.34
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double pointPosition = (x1 - x0)*(y2-y0) - (x2 - x0)*(y1 - y0); // checks to see if its either on the RIGHT side or LEFT side or On the line

        //Will have to check for the distance ON the line
        //so in our x2 and y2 have to be between x0 x1 and y0 y1.
        if(pointPosition == 0 && x2 > x0 && x2 < x1 && y2 > y0 && y2 < y1){
            System.out.println(pointPosition);
            System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
        else{
            System.out.println(pointPosition);
            System.out.println("(" + x2 + ", " + y2 + ") is NOT on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
        */

        /*
        //QUESTION 3.35
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 15: ");
        int decimal = input.nextInt();

        switch (decimal){
            case 0:
                System.out.println("The hex value is 0");
                break;
            case 1:
                System.out.println("The hex value is 1");
                break;
            case 2:
                System.out.println("the hex value is 2");
                break;
            case 3:
                System.out.println("the hex value is 3");
                break;
            case 4:
                System.out.println("the hex value is 4");
                break;
            case 5:
                System.out.println("the hex value is 5");
                break;
            case 6:
                System.out.println("the hex value is 6");
                break;
            case 7:
                System.out.println("the hex value is 7");
                break;
            case 8:
                System.out.println("the hex value is 8");
                break;
            case 9:
                System.out.println("the hex value is 9");
                break;
            case 10:
                System.out.println("the hex value is A");
                break;
            case 11:
                System.out.println("the hex value is B");
                break;
            case 12:
                System.out.println("the hex value is C");
                break;
            case 13:
                System.out.println("the hex value is D");
                break;
            case 14:
                System.out.println("the hex value is E");
                break;
            case 15:
                System.out.println("the hex value is F");
                break;
            default:
                System.out.println("Invalid input");
        }
        */


    }
}
