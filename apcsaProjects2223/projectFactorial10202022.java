package apcsaProjects2223;

public class projectFactorial10202022
{
    public static void main(String[] args)
    {
        //write a program that can return the factorial number of any given number
        //            Ex:
        //                input: 5
        //                output: 120
        //
        //            because:
        //                5! = 5 * 4 * 3 * 2* 1 = 120

        int number = 10;
        int factorial = 1;
        for(int i = 1 ; i<=number ; i++)
        {
            System.out.println(i);
            factorial=factorial*i;

        }
        System.out.println(factorial);
    }
}
