package apcsaWarmUps2223;

import java.util.Scanner;

public class warmUp10132022
{
    public static void main(String[] args)
    {
        //write a program that can calculate the two numbers based on the user provided operators, the program will ask:
        //                        1. enter first number
        //                        2. enter the second number
        //                        3. enter the math operators
        //                                (assume that only the +, -, *, /, and % will be entered)
        //                        then the system will give the result based on the operator
        //                        at the end it will ask if the user want's to calculate another numbers, if user entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
        //                                (you will need a lop that has true condition without the iterator)

        while (true)
        {
            System.out.println("Welcome to my Calc to continue press Enter key to quit press q");
            Scanner scanner2 = new Scanner(System.in);
            String qOrC = scanner2.nextLine();
            if(qOrC.equalsIgnoreCase("q"))
            {
                System.exit(0);
            }
            else {}

            System.out.println("Enter fist number");
            Scanner scanner = new Scanner(System.in);
            int firstNumber = scanner.nextInt();
            System.out.println("enter second number");
            int secondNumber = scanner.nextInt();
            System.out.println("enter the operator + - * / %");
            Scanner scanner1 = new Scanner(System.in);
            String operator = scanner1.nextLine();
            if(operator.equals("+")){System.out.println("your result = "+(firstNumber+secondNumber));}
            if(operator.equals("-")){System.out.println("your result = "+(firstNumber-secondNumber));}
            if(operator.equals("*")){System.out.println("your result = "+(firstNumber*secondNumber));}
            if(operator.equals("/")){System.out.println("your result = "+(firstNumber/secondNumber));}










        }



    }
}
