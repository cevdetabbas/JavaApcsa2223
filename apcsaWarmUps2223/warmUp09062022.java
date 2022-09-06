package apcsaWarmUps2223;

import java.util.Scanner;

public class warmUp09062022
{
    public static void main(String[] args)
    {
        System.out.println("tell me your grade");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();

        if(grade<60)
        {
            System.out.println("fail");
        }
        if(grade>=60&&grade<90)
        {
            System.out.println("pass");
        }
        if(grade>=90)
        {
            System.out.println("Passed with Distinction");
        }

    }
}
