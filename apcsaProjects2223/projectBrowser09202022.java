package apcsaProjects2223;

import java.util.Scanner;

public class projectBrowser09202022
{
    public static void main(String[] args)
    {
        String browserName ;
        System.out.println("enter your browsername");
        Scanner scanner = new Scanner(System.in);
        browserName=scanner.nextLine();

        if(browserName.equalsIgnoreCase("chrome"))
        {
            System.out.println("it is a valid browser");
        }
        else if(browserName.equalsIgnoreCase("safari"))
        {
            System.out.println("it is a valid browser");
        }
        else
        {
            System.out.println("not a valid browser");
        }


    }
}
