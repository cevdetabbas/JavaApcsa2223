package apcsaLessons2223;

public class Java4_RelationalComparisonOperators08252022
{
    public static void main(String[] args)
    {
        /*
        RELATIONAL/COMPARISON OPERATORS

        All relational operators return Boolean(true or false)
            Description             Operator
                >                  Greater than
                >=                 Greater than or equal
                <                  Less than
                <=                 Less than or equal
                ==                 Equal
                !=                 Not Equal
         */
        System.out.println(6<3);
        System.out.println(6>3);
        System.out.println(6<=3);
        System.out.println(6>=3);
        System.out.println(6==3);
        System.out.println(3==3);
        System.out.println(6!=3);

        /*
        Task
Declare and Initialize 2 numbers.
Program should display if the first number is greater than second number.
Output should be in the following format:
“First number number is greater than Second number – True/False”
         */
        int b; // declation
        b=2;  //  assigning a value, initialize
        int a = 2;  //  declaring and initializing


        System.out.println("First number is greater than second number " + (b>=a));


        /*
          LOGICAL OPERATORS

          Operator      Description
             &&             Bitwise logical AND
             ||             Bitwise Logical Inclusive OR
             ^              Bitwise Logical Exclusive OR
         */



        //  && returns true only if both conditionis are true
        System.out.println(true&&true);  // true
        System.out.println(true&&false); // false
        System.out.println(false&&true); // false
        System.out.println(false&&false); // false

        //  || returns true if at least one of the condition is true
        System.out.println(true||true); // true
        System.out.println(true||false); // true
        System.out.println(false||true); // true
        System.out.println(false||false); // false

        // ^ if both condition are the same it returns false
        System.out.println(true^true);  // false
        System.out.println(true^false); // true
        System.out.println(false^true); // true
        System.out.println(false^false); // false

        System.out.println(!true); // false exclamation mark turns return true to false vv.

        /*
        Order of Precedence Operators Description
        1 -(unary negation) ! Unary negation, logical NOT
        2 * / % Multiplication, division, modulus
        3 + - Addition, subtraction
        4 < > <= >= Less than, Greater than, Less than or Equal to, Greater than or equal to
        5 == != Equal to, not equal to
        6 && Logical AND
        7 || Logical OR
        8 = += -= *= /= %= Assignment and combined
        assignments
         */
        System.out.println(!true);
        int aa = 3 , bb= 3, cc=7;
        int n1 =4;
        int n2 = 8;
        int n3 = 9;
        boolean b1 = true, b2=false, b3=false;

        /*
        Task
1. Create a double variable with the value 20
2. Create a second variable of type double with the value 80
3. Add both numbers up and multiply by 25
4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
5. Print remaining total (#4) is equal to 20 or less : true/false
         */


    }
}
