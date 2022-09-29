package apcsaProjects2223;

import java.util.Scanner;

public class projectMiddleChar09292022
{
    public static void main(String[] args)
    {
        String str = "Johny"; // we need h to pick which index number 2 but lenght is 5 so what is the function behind it
        //  you need to divide lenght by 2 if the length is odd

        String str2 = "john";  // since lenght is even which is 4 we need index number of 1 and 2 which half of the length minus 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String str3 = scanner.nextLine();

        if(str3.length()%2==0)
        {
            System.out.println(str3.substring((str3.length()/2-1),(str3.length()/2)+1));
        }
        else
        {
            System.out.println(str3.charAt(str3.length()/2));
        }

    }
}
