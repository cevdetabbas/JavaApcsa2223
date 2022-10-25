package apcsaProjects2223;

import java.util.Scanner;

public class projectFirstLetter10252022 {
    public static void main(String[] args) {
//Write a program that will take five Strings and save them into an array called arr.
//        2. use for each loop to print out the first three letter of each element of arr, one per line. You can assume that every element of arr is at least 3 letters long.
//            Example:
//                arr -> ["apple", "banana"]
//                prints: app
//                        ban
        //  how to print first 3 letters of harmony.
        String str = "Harmony";
        System.out.println(str.substring(0, 3));
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 5 string");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String str4 = scanner.nextLine();
        String str5 = scanner.nextLine();
        String[] arr = {str1,str2,str3,str4,str5};
        for(int i = 0 ;i<arr.length ; i++)
        {
            System.out.println(arr[i].substring(0,3));
        }


    }
}