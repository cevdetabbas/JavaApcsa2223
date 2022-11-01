import java.util.Scanner;

public class BinaryConverter
{
    public static void main(String[] args)
    {
        System.out.println("enter the age you wnat to convert to binary");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        String binaryNumberOfAge = "";
        int counter = 0 ;
        while(true)
        {
            if(age<0||age>122)
            {
                System.out.println("invalid number");
                break;
            }
            if(age==1)
            {
                binaryNumberOfAge+="1";
                break;
            }
            if(age%2==0)
            {
                binaryNumberOfAge+="0";
            }
            else
            {
                binaryNumberOfAge+="1";
            }
            age=age/2;

        }
        String binaryReversed = "";
        //System.out.println(binaryNumberOfAge);
        for(int i = 0 ;i<binaryNumberOfAge.length();i++)
        {
            binaryReversed+=binaryNumberOfAge.charAt(binaryNumberOfAge.length()-i-1);
        }
        System.out.println(binaryReversed);

    }
}
