package apcsaProjects2223;

import java.util.Scanner;

public class projectPrintReally09302022
{
    public static void main(String[] args)
    {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Give me a word");
            String str1 = scanner.nextLine();

            if(str1.endsWith("ly")){
                System.out.println("really?");
            }
            else{
                System.out.println("never mind");
            }


    }

}
