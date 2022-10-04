package apcsaWarmUps2223;

import java.util.Scanner;

public class warmUp10042022
{
    public static void main(String[] args)
    {
        // write a program that asks user's first and last name, then prints out the initials of the user
        //Ex:
        //input:
        //Harmony
        //School
        //output
        //H.S.

        Scanner scanner = new Scanner(System.in);
        System.out.println("name?");
        String name = scanner.nextLine();
        System.out.println("lastname?");
        String lastName = scanner.nextLine();

        System.out.println(name.toUpperCase().charAt(0)+"."+lastName.toUpperCase().charAt(0)+".");

    }
}
