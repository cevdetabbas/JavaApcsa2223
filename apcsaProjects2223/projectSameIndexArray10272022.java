package apcsaProjects2223;

import java.util.Arrays;

public class projectSameIndexArray10272022
{
    public static void main(String[] args)
    {
        // 1. create an int array called numbers that has length of 100
        //        2. assign 1~100 to the array' each indexes
        //        3. use for each loop to print out all the even numbers.

        int[] numbers = new int[100];

        numbers[0]=0;
        numbers[1]=1;
        numbers[2]=2;
        System.out.println(Arrays.toString(numbers));

        for(int i = 0 ; i<numbers.length ; i++)
        {
            numbers[i]=i;
        }
        System.out.println(Arrays.toString(numbers));

        //  even numbers
        int[] evenNumbers = new int[50];
        for(int i = 0 ,a=0; i<numbers.length ; i++)
        {
            if(i%2==0)
            {
                evenNumbers[a]=numbers[i];
                a++;
            }
        }
        System.out.println(Arrays.toString(evenNumbers));

    }
}
