package apcsaProjects2223;

import java.util.Scanner;

public class projectGrades09062022
{
    public static void main(String[] args)
    {
        System.out.println("enter your 3 grades");
        Scanner scanner = new Scanner(System.in);
        double g1 = scanner.nextDouble();
        double g2 = scanner.nextDouble();
        double g3 = scanner.nextDouble();

        double avarage = (g1+g2+g3)/3;

        if(avarage>=90&&avarage<100)
        {
            System.out.println("A");
        }
        if(avarage>=80&&avarage<90)
        {
            System.out.println("B");
        }
        if(avarage>=70&&avarage<80)
        {
            System.out.println("C");
        }
        if(avarage>=60&&avarage<70)
        {
            System.out.println("D");
        }
        if(avarage<60)
        {
            System.out.println("F");
        }


    }
}
