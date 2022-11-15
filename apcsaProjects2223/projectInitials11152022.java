package apcsaProjects2223;

public class projectInitials11152022
{
    //  write a  method to get initials of a persons first and last name write a non-void method
    //  Ex: Donald Trump  output: D.T.

    public static String methodInitials(String name, String lastName)
    {
        return name.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase()+".";
    }
}
