package apcsaLessons2223;

public class Java3_ArithmeticOperators08232022
{
    //  if you need to change the class name
    //  you can not do it directly
    //  use refractor option right clicking the class name
    public static void main(String[] args)
    {
        //ARITMETIC OPERATORS
// priority is just like the algebra  +-*/%
//        OPERATOR	    USE				    DESCRIPTION					    EXAMPLE
/*
            +           x+y                 adds c and y                    3+7=10
            -           x-y                 subtract y from a               12-3=9
            *           x*y                 multiply x and y                3*4=12
            /           x/y                 divide x by y                   12/4=3
            %           x%y                 remainder                        8%6=2
            -            -x                 arithmetically negates x         int a = 3 , -a = -3;
            ++           x++                it increases the number by 1     a++
            --           --x                it decreases the number by1      a--
*/
        System.out.println(3+7);//10
        System.out.println(8-2); //6
        System.out.println(4*6); //24
        System.out.println(3*2.3); // if you using decimal result will contain decimals
        int a = 3;
        int b = 5;
        double c = 3;
        double d = 5;

        System.out.println(a+b); // 8
        System.out.println(a*b);
        System.out.println(a/b);  // it returns only whole number since it is whole number.
        System.out.println(c/d);  // it returns decimal number since variables are double

        //  CONCATINATION
        //  writing different data types within sout. if you put a string it wont be considedered as arithmetic unless
        //  you put math within pharanthesis.
        System.out.println("collection of five and three is "+5+3); //  this does not do the math
        System.out.println("collection of five and three is "+a+b); //  this does not do the math
        System.out.println("collection of five and three is "+"5"+"3"); //  this line contains only string
        System.out.println("collection of five and three is "+(5+3));   //  this is going to do the math within phar
        System.out.println("collection of five and three is "+(a+b));  //  this is going to do the math within phar//
        System.out.println("c"+(a+b));  //  this is going to do the math within phar//
        System.out.println((5-2)+(4*7));  //  java and arithmetic handles pharanthesiss first.
        System.out.println(5*2.3);      //  it will return a float number since it has a float number.
        int number = 3;
        System.out.println(number);
        System.out.println(++number);
        System.out.println(number++);
        System.out.println(number);
    
        int number2 = 7;
        System.out.println("number2 = " + number2); //7
        number2--;  //  6
        System.out.println("number2 = " + number2); // 6
        System.out.println(--number2);  // 5
        System.out.println(number2--);   // print 5 but then will be 4
        System.out.println(number2);    // 4


        //  CASTING
        //  casting converts data types one to another if it is possible
        double dd = -3.9;
        System.out.println(dd);
        int asdf = (int)dd;   //  this casting is going to take only the whole number part.
        System.out.println((int)dd );

        // IMPLICIT CASTING
        double d1 = 3000;  // 3000 is a whole number which is int but since data type is double it return as double
        long l = asdf;
        System.out.println(d1);
        System.out.println(l);

        // EXPLICIT CASTING
        double price = 200.55;
        System.out.println((int)price);

        //  SHORTHAND OPERATORS
        int number3 = 5;
        number3 = 5+5; //10
        number3+=5; //number3 = 5+5;
        System.out.println(number3);
        int numberA = 33;
        numberA+=22;   // this means numberA = numberA + 22;
        System.out.println(numberA);
        numberA*=3;
        System.out.println(numberA);
        numberA/=3;
        System.out.println(numberA);
        numberA-=9;  //  numberA = numberA-9;
        System.out.println(numberA);
        numberA%=3;  //  remainder of numberA divided by 3;
        System.out.println(numberA);


    }
}
