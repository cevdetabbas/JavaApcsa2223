package apcsaWarmUps2223;

public class warmUp10062022
{
    public static void main(String[] args)
    {
        //write a program that can remove duplicated characters from a string
        String str = "abcdabcd";

        //  if the first indexOf and the lastindexof value is the same
        //  then this means the letter has no dublication.

        for(int i = 0 ; i<str.length();i++)
        {
            if(str.indexOf(str.charAt(i))!=str.lastIndexOf(str.charAt(i)))
            {
                System.out.println("char at i "+str.indexOf(str.charAt(i)));
                System.out.println("last index of letter "+str.lastIndexOf(str.charAt(i)));
                //so delete last index from str
                str=str.substring(0,str.lastIndexOf(str.charAt(i)))+str.substring(str.lastIndexOf(str.charAt(i))+1,str.length());

            }

        }
        System.out.println(str);

    }
}
