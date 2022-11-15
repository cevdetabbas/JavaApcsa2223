package apcsaLessons2223;

import java.util.Locale;

public class Java21_ReturnMethods
{
    //  these methods can use any types of data type. primitive or non-primitive
    //  does not have void as return type
    /// must return a value
    //  the returning value must match with the return type of the method.
    //  the method must be closed  with return statement. with return it exit the method immediately
    //  return methods are either printed or assigned to the other variable
    //  you can put return in main method.

    public static int avarageOfThree(int a , int b , int c)
    {
        return ((a+b+c)/3);
    }
    public static int maxOfTwo(int a , int b)
    {
        return (Math.max(a,b));
    }

    public static void aOtree(int a , int b , int c)
    {
        System.out.println(a+b+c);
    }
    public static void mOtwo(int a , int b)
    {
        System.out.println(Math.max(a,b));
    }
    //  write a  method to get initials of a persons first and last name write a non-void method
    //  Ex: Donald Trump  output: D.T.

    public static String projectInitials(String name, String lastName)
    {
        return name.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase()+".";
    }



    public static void main(String[] args)
    {
        System.out.println(avarageOfThree(3,5,7)+maxOfTwo(5,7));
        aOtree(3,5,7);mOtwo(3,5);
        System.out.println(projectInitials("donald","trump"));

        System.out.println(methodCarPrice("red",21,true));

    }




    //  Project Car Price
    //  create a method with name methodCarPrice which takes
    //  3 cars properties to calculate the value of the car
    //  base price: $20.000
    //  white color $2.000, black color $3.000, red color $5.000  ---  String
    //  wheel 19inch $3.000, 21inch $5.000      ---  int
    //  sunroof $6.000      ---  boolean

    public static int methodCarPrice(String color, int wheel , boolean sunroof)
    {
        int totalPrice = 0;
        int basePrice = 20000;
        totalPrice+=basePrice;
        if(color.equalsIgnoreCase("white"))
        {
            totalPrice=totalPrice+2000;
        }
        if(color.equalsIgnoreCase("black"))
        {
            totalPrice=totalPrice+3000;
        }
        if(color.equalsIgnoreCase("red"))
        {
            totalPrice=totalPrice+5000;
        }
        if(wheel==19)
        {
            totalPrice=totalPrice+3000;
        }
        if(wheel==21)
        {
            totalPrice=totalPrice+5000;
        }
        if(sunroof)
        {
            totalPrice=totalPrice+6000;
        }
        return totalPrice;
    }



}
