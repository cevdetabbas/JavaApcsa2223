package apcsaProjects2223;

public class projectCapLow12082022
{
    public static void main(String[] args)
    {
        System.out.println(projectCapLow("asdefasdf"));

    }

    public static String projectCapLow(String str)
    {
        String newString = "";  //  I created an empty string, in each iteration it will add capital and lower case letters
        for(int i = 0 ; i<str.length() ; i++)
        {
            if(i%2==0) //  this means the index number is even so it needs to be capitilazed
            {
                char c = str.charAt(i);
                String d = Character.toString(c);
                newString+=d.toUpperCase();

            }
            else  //  this means the index number are odd then they will be lower cased
            {
                char e = str.charAt(i);
                String f = Character.toString(e);
                newString+=f.toLowerCase();
            }
        }
        return newString;

    }

}
