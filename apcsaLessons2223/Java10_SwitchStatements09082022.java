package apcsaLessons2223;

public class Java10_SwitchStatements09082022
{
    public static void main(String[] args)
    {
        //  Switch statement can be used for limited case it is defined by an expression which can be
        //  string boolean or integer here it is how we will use

        //  break statement break the block

        /*
        switch statement' expression cannot be boolean

        caseValues MUST be matching with the switch statement's expressions
        caseValue MUST be unique

        default: gets executed if none of case are matching

        break statement: used for exiting the switch statement' block

        if we do not give break statement, then the next available code fragments in switch will be executed

        switch does not accept: long, float, double, boolean
         */

        int h = 3;
        switch (h)
        {
            case 1:
                System.out.println("it is number1");
                break;
            case 2:
                System.out.println("it is number2");
                break;
            case 3:
                System.out.println("it is number3");
                break;
            default:
                System.out.println("default case");

        }

    }
}
