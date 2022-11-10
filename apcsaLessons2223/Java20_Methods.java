package apcsaLessons2223;

import java.sql.SQLOutput;

public class Java20_Methods
{

        //  grouping a series of statement together to perform specific tasks like functions
        //  methods can make our codes reusable , you do not need to repeat same set of statements
        //  without main method you can not run any java application
        //  you can not create a method within a method.
        //  methods must be created/ declared within a class. not within a method.
        //  we call the methods by their name
        //  void method does not return any value
        //  you can not create 2 main method within same class.
        //  you can not create a main method  within a main method
        //  but you can call one method within another method.

////////////////////////////////////////////////////////////////////////////////////////////////////////
// METHOD DECLARATION
////////////////////////////////////////////////////////////////////////////////////////////////////////
//      Public          Static          void        main            (String[] args)     {}
//-------------------------------------------------------------------------------------------------------
//      access          specifier       return      method              arguments       method
//      modifier                        type        name                                body
///////////////////////////////////////////////////////////////////////////////////////////////////////////


//  VOID METHODS WITHOUT PARAMETERS
    //  declarations on a method
        public static void myFirstMethod()
        {
            System.out.println("Hello World");
            System.out.println("how are u doing toda");
            System.out.println("Trent is a good student ");
            System.out.println("They say he is not");
        }

        //  lets create a method to print number from 0 to 100 name it oneToHundred
    public static void oneToHundred()
    {
        for(int i = 0 ; i<100 ; i++)
        {
            System.out.print(i+" ");
            System.out.println();
        }
    }

    //  create a method which finds a number is even or odd
    public static void evenOrOdd(int a)
    {
        if(a%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }

    //  create a method to find collection of two(Argument) number call it sumOfTwo
    public static void  sumofTwoNumbers(int a, int b)
    {
        System.out.println(a+b);
    }
    //  write a method which removes duplicates from the string and print out the result
    public static void removeDuplicates(String str)
    {
        String result ="";
        for(int i= 0 ; i<str.length() ; i++)
        {
            if(!result.contains(String.valueOf(str.charAt(i))))
            {
                result+=String.valueOf(str.charAt(i));
            }
        }
        System.out.println(result);
    }

    //  write a method which converts km to mile and mile to km 1.60934  0.621371

    public static void kmToMile(double d)
    {
        System.out.println(d*0.620934);
    }
    public static void mileToKm(double e)
    {
        System.out.println( e +" miles equals to "+(3*1.60934)+" km");
    }
    public static int topla(int a , int b)
    {
        return a+b;
    }


    public static void main(String[] args)
    {
        //  how to call a method?   answer with its name
        myFirstMethod();
        oneToHundred();
        evenOrOdd(222222222);
        sumofTwoNumbers(5,7);
        removeDuplicates("Nathaniela");
        mileToKm(4);
        topla(3,5);
    }







}
