package apcsaWarmUps2223;

public class warmUp08252022
{
    public static void main(String[] args)
    {
        //  create a new package within your apcsa2223 project and name it warmUps
        //  create a new java class with name warmUp08252022
        //  Create an int variable and assign to value 65
        //  print this value with concatinating 65 minutes to the console
        //  Using mathematical operators calculate and print how many hours and minutes it has.
        //  Clue: use casting casting
        int a = 65;
        //System.out.println(a + " minutes");
        //System.out.println((a/60) + " hours "+ (a%60) + " minutes");
        int hours = a/60;
        int minutes = a%60;

        System.out.println(" a minutes equals "+ hours + " hours" + " and "+minutes + " minutes");


    }
}
