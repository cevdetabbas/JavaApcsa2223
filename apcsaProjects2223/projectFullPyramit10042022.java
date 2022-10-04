package apcsaProjects2223;

import java.util.Scanner;

public class projectFullPyramit10042022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of level you want");
        int numberOfLevels = scanner.nextInt();
        String bricks = "";
        String spaces = "";
         for(int i = 0,j=1 ; i<numberOfLevels ; i++ )
         {
             System.out.println(j);


             spaces+=" ";
             bricks+="-";
             System.out.println(spaces+bricks+spaces);
             j+=2;




         }

    }
}
