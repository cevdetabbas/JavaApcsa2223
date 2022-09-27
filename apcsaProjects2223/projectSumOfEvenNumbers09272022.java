package apcsaProjects2223;

public class projectSumOfEvenNumbers09272022
{
    public static void main(String[] args)
    {
        //  write a program that can calculate the sum of all the even numbers between 1 ~ 100
        int sum = 0 ;
        for(int i = 0 ; i<100 ; i++)
        {
            if(i%2==0)
            {
                sum= sum+i;
                System.out.println(sum);
            }
        }
        //System.out.println(sum);

    }
}
