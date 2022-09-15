package apcsaProjects2223;

import java.util.Scanner;

public class projectNumberConverter09152022
{
    public static void main(String[] args)
    {
        //write a java program that can convert numbers between 0 ~ 9 to words,
        //if the number is greater than 9 or less than zero, out put should be "Invalid".

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number 0-9 to convert");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("Zero");
        }
        else if(num==1){
            System.out.println("One");
        }else if(num==2){
            System.out.println("T");
        }else if(num==3){
            System.out.println("Three");
        }else if(num==4){
            System.out.println("Four");
        }else if(num==5){
            System.out.println("Fi");
        }else if(num==6){
            System.out.println("Six");
        }else if(num==7){
            System.out.println("Seven");
        }else if(num==8){
            System.out.println("Eight");
        }else if(num==9){
            System.out.println("Nine");
        }


    }
}
