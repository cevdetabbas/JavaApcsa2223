package apcsaProjects2223;

public class projectSumOfOddNumbers09272022
{
    public static void main(String[] args)
    {
        //  write a program that can calculate the sum of all the odd numbers between 1 ~ 100

        int sum = 0 ;
        for(int i = 0 ; i<100 ; i++)
        {
            if(i%2==1)
            {
                sum= sum+i;

            }
        }
        System.out.println(sum);

    }
}
