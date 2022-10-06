package apcsaWarmUps2223;

public class warmUp09302022
{
    public static void main(String[] args)
    {
        //  Ask user to enter two words. Print first word without its first character then print the second word without its first character.

        String str1 = "alexander";
        String str2 = "Agentleman";
        int lengthOfstr1 = str1.length();
        int lengthOfstr2 = str2.length();

        System.out.println(str1.substring(1,lengthOfstr1));
        System.out.println(str2.substring(1,lengthOfstr2));



    }
}
