import java.util.Scanner;

public class Chapter4 {

    public static void main(String[] args) {


        /*
        //QUESTION 4.1
        //For this problem I started with declaring my variables, then my Scanner class asking the user for integer,
        // then wrote the while-loop, then added the if-else statement to seperate and count the posotives and the negatives,
        //then calculate the total and average. After that didi the print statements. Then realized to just add the part where
        //if no numbers are entered except 0 so to do that I wrote and if-else statement to enclose the code I have written so far.
        //It was like starting from the middle inside to the outer outside.
        Scanner input = new Scanner(System.in);

        int countPosotives = 0;
        int countNegatives = 0;
        int total = 0;
        float avg = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int integer = input.nextInt();

        if(integer == 0){
            System.out.println("No numbers are entered except 0");
        }
        else {

            while (integer != 0) {

                if (integer > 0) {
                    countPosotives++;
                } else if (integer < 0) {
                    countNegatives++;
                }

                total += integer;
                avg = (float) total / (countPosotives + countNegatives);
                System.out.print("Enter an integer, the input ends if it is 0: ");
                integer = input.nextInt();


            }

            System.out.println("The number of posotives is " + countPosotives);
            System.out.println("The number of negatives is " + countNegatives);
            System.out.println("The total is " + total);
            System.out.println("The average is " + avg);

        }
        */

        /*
        //QUESTION 4.2
        final int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while(count < NUMBER_OF_QUESTIONS){
            int number1 = (int) (Math.random() * 15 +1); //Numbers between 1 and 15
            int number2 = (int) (Math.random() * 15 +1); //Numbers between 1-15

            System.out.print("What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();

            if(number1 + number2 == answer){
                System.out.println("You are correct!");
                correctCount++;
            }
            else{
                System.out.println("Your answer is wrong. \n" + number1
                + " + " + number2 + " should be " + (number1 + number2));
            }

            count++;
            output += "\n" + number1 + "+" + number2 + "=" + answer +
                    ((number1 + number2 == answer) ? " correct" : " wrong");

        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount +
                "\nTest time is " + testTime / 1000 + " seconds\n" + output);
        */

        /*
        //QUESTION 4.3
        System.out.println("Kilograms   Pounds");
        for(int i=0; i < 200; i++){
            double pounds = i * 2.2;
            System.out.println(i + "            " + pounds);
        }
        */

        /*
        //QUESTION 4.4
        System.out.println("Miles\tKilometers");
        for(int i=1; i<11; i++){
            double kilometers = i * 1.609;
            System.out.println(i + "\t\t" + kilometers);
        }
        */

        /*
        //QUESTION 4.5*
        System.out.println("Kilograms\t Pounds  |   Pounds\t\t  Kilograms");
        for(int k=1 , p=20; k<200 && p<515; k+=3, p+=5 ) {
            double pounds = k * 2.2;
            double kilograms = p / 2.2;
            System.out.printf("%-12d%7.1f", k, pounds);
            System.out.print("  |   ");
            System.out.printf("%-9d%12.2f\n", p, kilograms);
        }
        */

        /*
        //QUESTION 4.6
        //NOTE: In the printf("%7.3f",  amount); the 3 in  7.3 specifies the number of digits to use after the decimal point
        //NOTES: In the printf(%12d, spaces); specifies the minimum number of spaces that should be used for the output.
            // If the integer that is being output takes up fewer than 12 spaces, extra blank spaces are added in front of the integer
            //to bring the total up to 12.
        System.out.println("Miles\t Kilometers  |   Kilometers\t\t  Miles");
        for(int m=1 , k=20; m<11 && k<70; m++, k+=5 ) {
            double kilometers = m * 1.609;
            double miles = k / 1.609;
            System.out.printf("%-12d%7.3f", m, kilometers);
            System.out.print("  |   ");
            System.out.printf("%-9d%12.3f\n", k, miles);
        }
        */

        /*
        //QUESTION 4.7
        double TUITION = 10000;
        double increasePercent = 0.05;
        double newTuition = 0;

        for (int i = 1; i < 11; i++) {      //   NOTES: int i=0; i<10 would be 0-9
            double tuitionincrease = TUITION * increasePercent;
            TUITION = TUITION + tuitionincrease;
            System.out.println("Tuition increase in year " + i + " is: " + tuitionincrease);
            System.out.println("Tuition is now: " + TUITION);


        }

        System.out.println("");
        System.out.println("In this loop it will be for the four years starting from where we left off at the tenth year");

        int totalCost = 0;
        for(int year = 1; year<=4; year++){
            System.out.println("Tuition for year " + year + " is: ");
            double universityinc = TUITION * increasePercent;
            TUITION = TUITION + universityinc;
            System.out.println(TUITION);
            totalCost += TUITION;
        }

        System.out.println("The total cost of four years' worth of tuition starting ten years from now is: " + Math.round(totalCost));
        */

        /*
        //HERE IS ANOTHER WAY SOMEONE ELSE DID IT!
        int totalCost = 0;		// Accumulate total cost of four years tution
        int tuition = 10000;
        int tuitionTenthYear = 0;

        for (int year = 1; year <= 14; year++) {
            // Increase tution by 5% every year
            tuition += (tuition * 0.05);

            if (year > 10) // Test for after 10 years
                totalCost += tuition; // Accumulate tution cost

            // Cost of tution in ten years
            if (year == 10)
                tuitionTenthYear = tuition;
        }

        // Display the cost of tution in ten years
        System.out.println("Tuition in ten years: $" + tuitionTenthYear);

        // Display the cost of four years' worth of tution after tenth year
        System.out.println("Total cost for four years' worth of tuition" +
                " after the tenth year: $" + totalCost);
        */

        /*
        //QUESTION 4.8
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Students: ");
        int numberOfStudents = input.nextInt();

        int i = 0;
        int highScore = 0;
        String highScoreName = " ";
        while (i < numberOfStudents) {
            System.out.print("Enter the Students name and score: ");
            String studentName = input.next();
            int score = input.nextInt();

            if(score > highScore){
                highScore = score;
                highScoreName = studentName;
            }

            i++;

        }

        System.out.println("The student with the highest score is: " + highScoreName + " with a score of " + highScore);
        */

        /*
        //QUESTION 4.9^
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Students: ");
        int numberOfStudents = input.nextInt();

        int highScore = 0;
        String highScoreName = " ";

        int secondHighScore =0;
        String secondHighScoreName = " ";

        int i = 0;
        while (i < numberOfStudents) {
            System.out.print("Enter the Students name and score: ");
            String studentName = input.next();
            int score = input.nextInt();

            if(score > secondHighScore) {
                secondHighScore = score;
                secondHighScoreName = studentName;

                if (secondHighScore > highScore) {
                    score = highScore;
                    studentName = highScoreName;

                    highScore = secondHighScore;
                    highScoreName = secondHighScoreName;

                    secondHighScore = score;
                    secondHighScoreName = highScoreName;

                }
            }

            i++;

        }

        System.out.println("The student with the highest score is: " + highScoreName + " with a score of " + highScore);
        System.out.println("The student with the second highest score is: " + secondHighScoreName + " with a score of " + secondHighScore);
        */


        //QUESTION 4.10
        /*
        int count = 0;
        for(int i = 100; i <= 1000; i+=10){
            if(i % 5 == 0 && i % 6 ==0){
                System.out.println("Number " + i + " is divisible by both 5 and 6");
                count++;
            }
        }
        System.out.println("Total number of numbers between 100 and 1,000 (going by 10's) that are divisible by 5 and 6 are: " + count);
        */
        //THIS IS THE ACTUAL CODE ANSWER TO THIS QUESTION mine was similar only because I understood the question wrong:
        /*
        final int NUMBERS_PER_LINE = 10;
        int count = 0;
        for(int i = 100; i <= 1000; i++){
            if (i % 5 == 0 && i % 6 ==0){
                count++;
                if(count % NUMBERS_PER_LINE == 0) {
                    System.out.println(i);
                }

                else {
                    System.out.print(i + " ");
                }
            }
        }
        */

        /*
        //QUESTION 4.11
        final int NUMBERS_PER_LINE = 10;
        int count = 0;
        for(int i = 100; i <= 200; i++){
            if (i % 5 == 0 || i % 6 ==0){
                count++;
                if(count % NUMBERS_PER_LINE == 0) {
                    System.out.println(i);
                }

                else {
                    System.out.print(i + " ");
                }
            }
        }
        */

        /*
        //QUESTION 4.12*
        int n = 0;

        while(Math.pow(n,2) < 12000){
            n++;
        }

        System.out.println(n + " is the lowest such that n^2 is greater than 12,000");
        System.out.println("Proof: " + (n-1) + "^2 = " + Math.pow(n - 1, 2)); //second to last is the smallest n because its below 12000
        System.out.println("Proof: " + n + "^2 = " + Math.pow(n, 2)); //last result is largest n because its above 12000
        */

        /*
        //QUESTION 4.13*
        int n = 0;

        do{
            System.out.println("|\t" + n + "^3\t|\t" + Math.pow(n++, 3) + "\t|"); //The last one from this loop is n less than 12,000
        }
        while(Math.pow(n,3) < 12000);

        System.out.println("23^3: " + Math.pow(23,3)); //This n would be greater than 12,000
        */
        /*
        //NOTE:HERE SHOWS DIFFERENCE BETWEEN WHILE AND DO-WHILE where while has to be true first then loop, and in do-while
        //we do first then loop. Thats why in while loop we stop AFTER 10 and in do-while we stop BEFORE going to loop again.
        int i =0;
        while(Math.pow(i,2) < 10){
           i++;
            System.out.println(Math.pow(i,2));
            System.out.println(i);
        }

        System.out.println("---");

        int l = 0;
        do{
            System.out.println(Math.pow(l++,2));
        }
        while(Math.pow(l,2) < 10);
        */

        /*
        //QUESTION 4.14*
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        // Make gcd to be the minimum of n1 and n2
        int gcd = n1 < n2 ? n1 : n2; //Here its finding d to be the minimum of n1 and n2

        // Find the greatest common divisor
        while (n1 % gcd != 0 || n2 % gcd != 0) {
            gcd--; //going by d, d-1,d-2,d-3,..., 2, or 1 is a divisor for both n1 and n2 in this order
        }

        // Display result
        System.out.println("The greatest common divisor for " + n1 +
                " and " + n2 + " is " + gcd);
        */

        /*
        //QUESTION 4.15*
        // Number of characters per line
        final int NUMBER_OF_CHARACTERS_PER_LINE = 10;
        int count = 0;	// Count the number of characters

        // Print the ASCII characters from ! to ~
        for (int i = 33; i <= 126; i++) {
            count++;	// Increment count
            // Display 10 characters per line
            if (count % 10 == 0)
                System.out.println((char)i);
            else
                System.out.print((char)i + " ");
        }
        System.out.println();
        */

        /*
        //QUESTION 4.16*
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int index = 2; // Numbers to test as factors

        // Find and display all the smallest factors in increasing order
        while (number / index != 1) {
            // Test as a factor of number
            if (number % index  == 0) {
                System.out.print(index + ", ");
                number /= index;
            }
            else
                index++; // Increment index
        }
        System.out.println(number + ".");
        */

        /*
        //QUESTION 4.17*
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer from 1 to 15
        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        // Display pyramid
        for (int rows = 1; rows <= numberOfLines; rows++) {
            // Create spaces in each row
            for (int s = numberOfLines - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            // Create decending numbers in each row
            for (int l = rows; l >= 2; l--) {
                System.out.print(l + " ");
            }
            // Create ascending number in each row
            for (int r = 1; r <= rows; r++) {
                System.out.print(r + " ");
            }
            // End line
            System.out.println();
        }
        */

        /*
        //QUESTION 4.18*
        //Display pattern A
        System.out.println("Pattern A");
        for(int i = 1; i <= 6 ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }


        // Display pattern B
        System.out.println("Pattern B");
        for (int r = 6; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }


        // Display pattern C
        System.out.println("Pattern C");
        for(int row = 1; row <= 6 ; row++){
            for(int whitespace = 1; whitespace <= (6-row); whitespace++){
                System.out.print("  ");
            }
            for(int j = 1; j <= row; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }


        // Display pattern D
        System.out.println("Pattern D");
        for (int i = 1; i <= 6; i++) {
            for(int k = i;k > 1; k--){
                System.out.print("  ");
            }
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        */

        /*
        //QUESTION 4.19*
        int startRight = 0,	// Initialize decending numbers
                endSpace = 7;		// Initialize number of white space in row
        // Display number of rows and numbers in each row
        for (int row = 1; row <= 128; row += row) {
            // Display white space
            for (int startSpace = 0; startSpace < endSpace; startSpace++) {
                System.out.print("    ");
            }
            // Display acending numbers
            for (int l = 1; l <= row; l += l) {
                System.out.printf("%4d", (l));
            }
            // Display decending numbers
            for (int r = startRight; r > 0 ; r /= 2 ) {
                System.out.printf("%4d", (r));
            }
            System.out.println();	// End line
            endSpace--; 				// Decrement endSpace
            startRight = row;			// Assign row to startRight
        }
        */

        /*
        //QUESTION 4.20
        final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 8 per line
        int count = 0; // Count the number of prime numbers

        System.out.println(
                "The prime numbers between 2 and 1,000, inclusive are \n");

        // Repeatedly find prime numbers
        for (int number = 2; number <= 1000; number++) {
            // Assume the number is prime
            boolean isPrime = true;	// Is the current number prime?

            // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0)	{ // If true, number is not prime
                    isPrime = false;	// Set isPrime to false
                    break;	// Exit the for loop
                }
            }

            // Display the prime number and increase the count
            if (isPrime) {
                count++;	// Increase the count

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Display the number and advance to the new line
                    System.out.println(number);
                }
                else
                    System.out.print(number + " ");
            }
        }
         */


//TO DO:
        //QUESTION 4.21
        //QUESTION 4.22
        //QUESTION 4.23
        //QUESTION 4.24
        //QUESTION 4.25
        //QUESTION 4.26
        //QUESTION 4.27
        //QUESTION 4.28
        //QUESTION 4.29
        //QUESTION 4.30
        //QUESTION 4.31
        //QUESTION 4.32
        //QUESTION 4.33
        //QUESTION 4.34
        //QUESTION 4.35
        //QUESTION 4.36
        //QUESTION 4.37
        //QUESTION 4.38
        //QUESTION 4.39
        //QUESTION 4.40
        //QUESTION 4.41
        //QUESTION 4.42
        //QUESTION 4.43
        //QUESTION 4.44
        //QUESTION 4.45
        //QUESTION 4.46
        //QUESTION 4.47




    }
}
