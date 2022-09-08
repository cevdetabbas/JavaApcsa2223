package apcsaProjects2223;

public class projectAgeGroups09082022
{
    public static void main(String[] args)
    {
        int age = 0 ;
        if(age<1)               {System.out.println("infant");}
        else if(age<5&&age>3)   {System.out.println("Toddler ");}
        else if(age<9&&age>6)   {System.out.println("Kid ");}
        else if(age<12&&age>10) {System.out.println("Pre-Teen");}
        else if(age<17&&age>13) {System.out.println("Teenager ");}
        else if(age<20&&age>18) {System.out.println("Young Adult ");}
        else if(age<39&&age>21) {System.out.println("Adult");}
        else if(age<49&&age>40) {System.out.println("Young Middle-Aged Adult");}
        else if(age<54&&age>50) {System.out.println(" Middle-Aged Adult");}
        else if(age<64&&age>55) {System.out.println("Very Young Senior Citizen");}
        else if(age<84&&age>75)  {System.out.println(" Young Senior Citizen");}
        else if(age<120&&age>85) {System.out.println(" Senior Citizen");}
        else if(age<0&&age>120) {System.out.println("invalid");}
        else                    {System.out.println("invalid");}

        if(5>4)
            System.out.println("5 greater than 3");

        //  this is not a good habit use curly brackets all the time...

    }
}
