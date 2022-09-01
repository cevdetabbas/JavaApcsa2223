package apcsaWarmUps2223;

import java.util.Scanner;

public class warmUp09012022
{
    public static void main(String[] args)
    {
        /*
        warmup task:
	1. write a java program that converts gallons to liters
	 					1 gallon = 3.785 liters
	 					1 litter = 1/3.785

	2. write a java program that converts litters to gallons
	 					1 gallon = 3.785 liters
	 					1 litter = 1/3.785

	3. manually calculate the following code fragements:
				1. int a = 200;
					int b = -a++ + - --a * a-- % 2
					b = ?

				2. int x = 300;
				   int y = 400;
				   int z = x + y - x * y +x / y;

         */
        System.out.println("put the number you wnat to convert from gallon to liter ");
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        System.out.println(+d +" gallon = "+(d*3.785)+" liters");

    }
}
