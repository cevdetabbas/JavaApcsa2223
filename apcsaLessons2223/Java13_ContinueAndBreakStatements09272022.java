package apcsaLessons2223;

public class Java13_ContinueAndBreakStatements09272022
{
    public static void main(String[] args)
    {
        /*
       Break statement: used for exiting switch statement and loops
       whenever we need to forcefully stop the iteration of the loop, we can use break statement
       Conntinue statement:  MUST be used in the loop skips current iteration
        */

        int luckyNumber = 33;

        for(int i = 0 ; i<100 ; i++)
        {
            if(i==luckyNumber)
            {
                break;
            }
            System.out.println(i);
        }

        for( int i = 0 ; i<10 ; i++)
        {
            if(i<4)
            {
                System.out.println(i);
                continue;
            }
            else
            {
                System.out.println(i);
            }
        }




    }
}
