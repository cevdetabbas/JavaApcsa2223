package apcsaWarmUps2223;

import java.util.Scanner;

public class warmUp09202022
{
    public static void main(String[] args)
    {
        // task:
        //    write a program for the rate calculater: rateCalculator
        //                        1. asks the user to enter yearly salary (as integer)
        //                        2. asks the user how many hours does she/he works in a week
        //                        3. print the hourly rate of the employee
        //
        //                        assume that one year has 52 weeks

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your yearly salary");
        double yearlySalary = scanner.nextInt();

        double weeklyPay = yearlySalary/52;
        double dailyRate = weeklyPay/5;
        double hourlyRate = dailyRate/8;

        System.out.println("your hourly rate is $ "+hourlyRate);





    }
}
