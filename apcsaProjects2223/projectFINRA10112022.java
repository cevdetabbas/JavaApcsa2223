package apcsaProjects2223;

public class projectFINRA10112022
{
    // write a program which prints out the numbers from 1 to 30:
    //            1. for numbers which are divisible by 3, print "FIN" instead of the number.
    //            2. for numbers which are divisible by 5, print "RA" instead of the number
    //            3. for numbers which are a divisible by both 3 and 5, print "FINRA" instead of the number

    public static void main(String[] args)
    {
        for(int i = 0 ;i<30 ; i++)
        {
            if(i%15==0)
            {
                System.out.println("the current number is "+i+" "+"FIN");
            }
            else if(i%5==0)
            {
                System.out.println("the current number is "+i+" "+"RA");

            }
            else if(i%3==0)
            {
                System.out.println("the current number is "+i+" "+"FINRA");
            }
        }

    }

}
