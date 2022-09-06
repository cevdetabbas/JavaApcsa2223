package apcsaProjects2223;

public class projectSalary09062022
{
    public static void main(String[] args)
    {
        int salary = 30000;
        int yearOnJob = 3;

        if(salary>=30000)
        {
            if(yearOnJob>=2)
            {
                System.out.println("you qualify for the loan");
            }
            else
            {
                System.out.println("you must have been on the job at least 2 years");
            }
        }
        else
        {
            System.out.println("you must earn at least $30000 dollars");
        }

    }
}
