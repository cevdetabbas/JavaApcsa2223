package apcsaProjects2223;

import java.util.Scanner;

public class projectMinOfFive10112022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int[] arr = {a,b,c,d,e};
        int min = a;

        for(int i = 1 ; i<arr.length ;i++)
        {

            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("min "+ min);
    }
}
