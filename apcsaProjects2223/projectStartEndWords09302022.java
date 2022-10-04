package apcsaProjects2223;

import java.util.Scanner;

public class projectStartEndWords09302022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 five letter words");
        String wrd1 = scanner.next();
        String wrd2 = scanner.next();
        int length1 = wrd1.length();
        int length2 = wrd2.length();

        if(length1!=5||length2!=5)
        {
            System.out.println("Both words need to be 5 letters in length");
        }
        else if(wrd2.charAt(0)==wrd1.charAt(4))
        {
            System.out.println("Fizz");
        }
        else
        {
            System.out.println("Buzz - did not match");
        }

    }
}
