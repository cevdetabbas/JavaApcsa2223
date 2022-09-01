package apcsaLessons2223;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Java7_IfStatements09012022
{
    public static void main(String[] args)
    {
        /*
        LOGICAL STATEMENTS
        The if statement evaluates a condition. If the condition evaluates to true, any statements
in the subsequent code block are executed.

        KEYWORD     CONDITION (MUST BE A BOOLEAN TRUE/FALSE)
           if       (5>7)
           {
               OUTPUT COMMAND TO EXECUTE IF THE CONDITION IS TRUE
           }
           else if ( in this certain condition)
           {
                output for this condition.
           }
           else
           {
                OUTPUT COMMAND IF CONDITION IS NOT TRUE for all other possible situations
            }
         */


        /*
        Task
Write a Java program:
1) Declare a variable and initialize user age.
2) Then the program will show if the user is eligible to vote. A Person who is eligible to
vote must be older than or equal to 18 years old.


         */

        System.out.println("enter your age ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        //  SINGLE IF STATEMENT
        if(age>18)
        {
            System.out.println("you are able to vote");
        }
        else
        {
            System.out.println("you can not vote");
        }

        /*
Task
Write Java program that will accept three numbers and return the greatest number.
-Input:
number1: 4
number2: 8
number3: 1
-Output:
The greatest number is: 8
         */

        System.out.println("please enter 3 different number");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter first number ");
        int number1 = scanner1.nextInt();
        System.out.println("enter second number ");
        int number2 = scanner1.nextInt();
        System.out.println("enter third number ");
        int number3 = scanner1.nextInt();

        //  first condition is the number1 is the greatest
        if(number1>number2)
        {
            if(number1>number3)
            {
                System.out.println("number1 "+number1+ " is the greatest");
            }
        }
        if(number2>number1)
        {
            if(number2>number3)
            {
                System.out.println("number2 "+number2+ "is the greatest");
            }
        }
        if(number3>number1)
        {
            if(number3>number2)
            {
                System.out.println("number3 "+number3+ "is the greatest");
            }
        }

        //  second condition is the number 2 is the greatest


        /*
        Task
1. Write a Java program that will accept two numbers and check if two numbers are
equal or not.
2. Write a Java program to implement following logic using if statement (use military time)
1. if hour is less than 12 noon, greet with Good Morning
2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good
Afternoon
3. if hour is greater than or equal to 3 pm, greet with Good Evening
         */
        System.out.println("enter 2 number to check if they are equal or not");
        int n1 = scanner1.nextInt();
        int n2 = scanner1.nextInt();
        if(n1==n2)
        {
            System.out.println("they are equal");
        }
        else{System.out.println("they are not");}


        System.out.println("this programs greets you please enter the time as hour");
        int hour = scanner1.nextInt();
        if(hour<12){System.out.println("good Morning");}
        if(hour>12&&hour<15){System.out.println("afternoon");}
        if(hour>15){System.out.println("evening");}

        //  NESTED IF STATEMENTS
        //  if statements within if statements

        boolean isWeekday = true ;
        boolean weatherIsSunny = true ;

        if(isWeekday==true)
        {
            if(weatherIsSunny==true)
            {
                System.out.println("picnic");
            }
            else
            {
                System.out.println("tv");
            }
        }
        else
        {
            System.out.println("school");
        }


        //  write a program to see if a number is positive or negative

        System.out.println("enter a number");
        int positiveOrNegative = scanner1.nextInt();

        if(positiveOrNegative>0)
        {
            System.out.println("it is positive ");
        }
        else if(positiveOrNegative==0)
        {
            System.out.println("number is 0");
        }
        else if(positiveOrNegative==-333)
        {
            System.out.println("number is -333");
        }
        else
        {
            System.out.println("number is negative");
        }




    }
}
