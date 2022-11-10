package apcsaWarmUps2223;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp11082022
{
    public static void main(String[] args)
    {
        //write a program that can return the longest string of text from the array
        //
        //write a program that can return the shortest string of text from an array

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple","banana","pear","dragonfruit","tomato"));

        //  to find the lenght I use a loop and if statement
        // first I will set the first item as max length item then if the next one is longer
        // max item will be replaced with that. if not max will be the same
        //  this will occur to every sigle item in the arraylist

        int maxLenghtFruit = fruits.get(0).length();
        int maxLengthFruitIterationNumber = 0;
        for(int i = 1 ; i<fruits.size() ; i++)
        {
            if(maxLenghtFruit<fruits.get(i).length())
            {
                maxLenghtFruit=fruits.get(i).length();
                maxLengthFruitIterationNumber=i;
            }
            if(i==fruits.size()-1)
            {
                System.out.println("the longest fruit name is "+fruits.get(maxLengthFruitIterationNumber));
            }
        }

        System.out.println(maxLenghtFruit);




    }
}
