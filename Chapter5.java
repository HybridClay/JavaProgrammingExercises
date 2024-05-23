import java.util.Scanner;

public class Chapter5 {

    public static void main(String[] args) {

        /*
        //QUESTION 5.1
        int count = 0;
        for(int i = 1; i<=100; i++){
            int n = getPentagonal(i);
            count++;
            if (count % 10 == 0){
                System.out.println(n);
            }
            else {
                System.out.print(n + " ");
            }
        }
        */

        /*
        //QUESTION 5.2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long number = input.nextInt();
        System.out.println(sumDigits(number));
        */

        /*
        //QUESTION 5.3*
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scan.nextInt();
        System.out.println(reverse(number));
        System.out.println(isPalindrome(number));
        */


        //QUESTION 5.4
        




//TO DO:
        //QUESTION 5.26
        //QUESTION 5.27
        //QUESTION 5.28
        //QUESTION 5.29
        //QUESTION 5.30
        //QUESTION 5.31
        //QUESTION 5.32
        //QUESTION 5.33
        //QUESTION 5.34
        //QUESTION 5.35
        //QUESTION 5.36
        //QUESTION 5.37
        //QUESTION 5.38
        //QUESTION 5.39



    }



    //VALUE RETURNING METHODS HERE:
    //FOR QUESTION 5.1
    public static int getPentagonal(int n){
        return n*(3*n - 1)/2;
    }

    //FOR QUESTION 5.2
    public static int sumDigits(long n){
        long remainder = 0;

        while(n != 0){
            remainder += n % 10;
            n = n /10;
        }
        return (int) remainder;

    }

    //FOR QUESTION 5.3*
    public static int reverse(int number){
        int remainder, revNumber = 0;
        while(number > 0){
            remainder = number % 10;
            number = number / 10;
            revNumber = (revNumber * 10) + remainder;
        }
        return revNumber;

    }

    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0){
            int remainder = palindrome % 10;
            reverse = (reverse * 10) + remainder;
            palindrome = palindrome / 10;
        }
        return number == reverse;
    }

    //FOR QUESTION 5.4






}
