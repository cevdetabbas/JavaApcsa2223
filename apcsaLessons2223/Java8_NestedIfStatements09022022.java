package apcsaLessons2223;

public class Java8_NestedIfStatements09022022
{
    public static void main(String[] args)
    {
        /*

        Syntax

         if(condition1)
         {
            statement1;
         }
         else if(condition2)
         {
            statement2;
         }
         else if(condition3)
         {
            statement3;
         }
         else
         {
            statement4;
         }


        NESTED IF is when more than one if statements located within each other

         if(condition1)
         {
            if(condition2)
            {
                statement1
            }
            else
            {
                statement2
            }
         }
         else
         {
              statement3
         }
         */



        /*
        Task

1. Write a Java program:
1) Declare and initialize a number
2) Display whether the number is an odd number or even number.

2. A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a
program that declares three integers as angles and check whether a triangle is valid or
not.
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a nuber to check even or odd ");
//        int a = scanner.nextInt(); //  declare and initialize.

//        if(a%2==0)  {System.out.println("number is even");}
//        else        {System.out.println("number is odd");}

        int firstAngle = 60;
        int secondAngle = 60;
        int thirdAngle = 60;

//        if((firstAngle+secondAngle+thirdAngle)==180)
//        {
//            System.out.println("it is a triangle");
//        }
//        else
//        {
//            System.out.println("it is not a triangle");
//        }

        // how to compare a string within a condition

        String name = "nathaniel";

        if(name=="nathaniel")
        {
            System.out.println("the name is nathaniel");
        }
        else
        {
            System.out.println("name is alejandro");
        }

        if(name.equals("nathaniel"))
        {
            System.out.println("name is nathaniel");
        }
        else
        {
            System.out.println("name is not nathaniel");
        }


        //




    }
}
