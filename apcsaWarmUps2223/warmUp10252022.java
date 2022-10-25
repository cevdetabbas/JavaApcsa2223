package apcsaWarmUps2223;

import java.util.ArrayList;

public class warmUp10252022
{
    public static void main(String[] args)
    {
        String[] emails = {"aaaa@gmail.com", "bbbbb@yahoo.com", "ccccc@gmail.com", "dddd@outlook.com", "eeee@yahoo.com", "ffff@hotmail.com", "gggg@outlook.com"};
        //
        //--print all email addresses only contains gmail
        //
        //--print email addresses excluding gmail addresses
        //
        //--print only username part of the email (before @)
        ArrayList<String> gmailList = new ArrayList<>();
        for(int i = 0 ; i<emails.length ; i++ )
        {
            if(emails[i].contains("gmail"))
            {
                //System.out.println(emails[i]);
                gmailList.add(emails[i]);
            }
        }
        System.out.println("gmail emails "+gmailList);

        //  excluding gmails. Lets create anohter list
        ArrayList<String> gmailsExcluded = new ArrayList<>();
        for(int i = 0 ; i<emails.length ; i++)
        {
            if(!emails[i].contains("gmail"))
            {
                //System.out.println(emails[i]);
                gmailsExcluded.add(emails[i]);
            }
        }
        System.out.println("Non-gmail emails "+gmailsExcluded);

        for(int i = 0 ; i<emails.length ; i++)
        {
            System.out.println(emails[i].split("@")[0]);
        }
    }
}
