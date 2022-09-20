package apcsaProjects2223;

import java.util.Scanner;

public class projectInfo09202022
{
    public static void main(String[] args)
    {
        //Task: Scanner_Practice1
        //    1. ask the user enter first name
        //    2. ask user to enter last name
        //    3. ask the user employeed or not? true ==> employeed, false ==> unemployed
        //    4. if he is employeed , ask the salary
        //    4. if he is not employeed set the salary to 0
        //
        //    output:
        //        full name:
        //        employeeed status:
        //        salary:

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first name");
        String name = scanner.nextLine();
        System.out.println("enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("are you employed y/n");
        String yesOrNo = scanner.nextLine();
        if(yesOrNo.equalsIgnoreCase("y"))
        {
            System.out.println("what is your salary");
            double salary = scanner.nextDouble();
            System.out.println("full name "+name+" "+lastName);
            System.out.println("employed status employed");
            System.out.println("salary is "+salary);
        }
        else if(yesOrNo.equalsIgnoreCase("n"))
        {
            System.out.println("full name "+name+" "+lastName);
            System.out.println("employed status unemployed");
        }
        else
        {
            System.out.println("not a valid choice");
        }


    }
}
