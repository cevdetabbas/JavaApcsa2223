package apcsaProjects2223;

public class projectReverseString10042022
{
    public static void main(String[] args)
    {
        //write a program that can reverse the following string:
        //String str = "Java";
        //output: avaJ

        String str = "Nathaniel";
        String reversedStr ="";
        String reversedStr2 = "";

        for(int i = 0 ; i<str.length() ; i++)
        {
            reversedStr+=str.charAt(str.length()-i-1);
        }
        System.out.println(reversedStr);

        for(int i = str.length()-1 ; i>=0 ; i--)
        {
            reversedStr2+=str.charAt(i);
        }
        System.out.println(reversedStr2);


    }
}
