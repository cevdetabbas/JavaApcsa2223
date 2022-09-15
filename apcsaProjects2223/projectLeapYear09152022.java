package apcsaProjects2223;

import java.util.Scanner;

public class projectLeapYear09152022
{
    public static void main(String[] args)
    {
        System.out.println("enter the number of the year");
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            int a = scanner.nextInt();
            if (a % 4 == 0) {
                System.out.println(a + " is a leap year");
            } else {
                System.out.println(a + " not a leap year");
            }
        }

    }
}
