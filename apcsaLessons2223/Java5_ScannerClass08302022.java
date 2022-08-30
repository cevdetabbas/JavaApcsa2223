package apcsaLessons2223;


import java.util.Scanner;

public class Java5_ScannerClass08302022
{
    public static void main(String[] args)
    {
        /*
          SCANNER CLASS
          scanner class is being used to get input from the user.
          but we need to import java.util.Scanner

          DECLERATION
          Scanner scanner = new Scanner(System.in);
          when you are asking user input use appropriate data type
          String name = scanner.nextLine();
          int age = scanner.nextInt();
          double price = scanner.nextDouble();
          boolean trueOrFalse = scanner.nextBoolean();

          String lastName = scanner.next();

         */

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("what is your name ");
//        String name = scanner.next();  //  THIS ONLY TAKES THE PART OF THE STRING BEFORE THE SPACE
//
//        System.out.println("your name is "+name );
//        System.out.println("what is your name ");
//        String name2 = scanner.nextLine();  //  THIS TAKES WHOLE LINE UNTIL YOU PRESS ENTER
//
//        System.out.println("your name is "+name2 );

        //System.out.println("what about the age?");
        //int age = scanner.nextInt();
        //System.out.println("your age is " +age);
        //System.out.println("what about the price ");
        //double price = scanner.nextDouble();
        //boolean trueOrFalse = scanner.nextBoolean();


        // TASK
        /*
        ask the following questions to the user and print everything at once
        name last name age student id number school name
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name");
        String name = scanner.nextLine();
        System.out.println("what is your lastname");
        String lastName = scanner.nextLine();
        System.out.println("what is your age");
        int age = scanner.nextInt();
        System.out.println("your school name?");
        String school = scanner.nextLine();
        System.out.println("your id number");
        long idNumber = scanner.nextLong();
        System.out.println("ok your name is "+ name+" last name is "+ lastName+" uyour age is "+age+" your school is"+school+" your id no is "+idNumber);



    }
}
