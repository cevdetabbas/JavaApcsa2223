package apcsaProjects2223;

public class projectPolindrome10112022
{
    public static void main(String[] args)
    {
        //  write a program that can check if a string of text is palindrome

        String str = "radar";
        boolean b1= true;
        for(int i = 0 ; i<str.length() ; i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                b1=false;
            }
            if(b1!=false)
            {
                b1=true;
            }
        }
        System.out.println(b1);




    }
}
