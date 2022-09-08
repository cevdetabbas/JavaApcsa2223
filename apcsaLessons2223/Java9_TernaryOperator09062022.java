package apcsaLessons2223;

import java.util.Scanner;

public class Java9_TernaryOperator09062022
{
    public static void main(String[] args)
    {
        //  ternary operator only works on questions like yes or no
        //  it is a kind of if statement only works with two ways.

        // variable declaration
        int n1 = 5, n2 = 10, max;

        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);

        // Largest among n1 and n2
        max = (n1 > n2) ? n1 : n2;

        // Print the largest number
        System.out.println("Maximum is = " + max);

        //  write an ternary statement if a user input number is greater than 50;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to check if it is greater than 50");
        int a = scanner.nextInt();
        String g = "number is greater than 50";
        String gnot = "number is not greater than 50";

        g = (a>50)?g:gnot;
        System.out.println(g);

        //  write a ternary statement which checks if a number is odd or even

        String evenOrOdd;
        int number1 = 4;

        evenOrOdd = (number1%2==0)? "even":"odd";
        System.out.println(evenOrOdd);

        //  nested ternary statements



    }
}
