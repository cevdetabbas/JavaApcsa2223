package apcsaLessons2223;


import java.sql.SQLOutput;
import java.util.Arrays;

public class Java15_Arrays10062022
{
    public static void main(String[] args)
    {
        //  arrays store more than one primitive variable but in same type
        //  array class is presented in java.utiils
        //  array size must be initialized
        //  default value of string is null int is 0 boolean is false char is space

        int[] arr = {111,222,3333,444};  // declaration of int array
        String[] arr2 = {"nathaniel","alex","chris","kris"};  //  declaration of string array
        char[] arr3 = new char[4];  //  4 is the size of the array declaration

        System.out.println(arr[0]); //  first value has 0 index number
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        //  System.out.println(arr[4]); array is not long enough

        //  ASSIGNING A VALUE
        arr[0]=456;
        arr[1]=987;
        arr[2]=765;
        System.out.println(arr[0]);

        //  PRINTING EACH VALUE OF AN ARRAY
        System.out.println(arr);  // this is not goint to print the array values
        System.out.println(Arrays.toString(arr));  //  we use arrays to string method to print values
        //  OR  we can use a loop in order to print line by line
        for(int i = 0 ; i<arr.length ;i++)
        {
            System.out.println(arr[i]);
        }

        //  ARRAY METHODS

        //  ARRAYS LENGHT
        System.out.println(arr.length); // this is going to give number of elements in an array

        //  SORT METHOD
        Arrays.sort(arr);  //  this will order ascending or alphebetical order
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //  BINARY SEARCH
        Arrays.binarySearch(arr,444);
        System.out.println(Arrays.binarySearch(arr2,"nathaniel"));

        //  SPLIT METHOD
        String stNames = "nathaniel alex chris kris";
        String[] stt = stNames.split(" ");
        System.out.println(Arrays.toString(stt));
        for(int i = 0 ; i<stt.length; i++)
        {
            System.out.println(stt[i]);
        }

        //  TO CHAR ARRAY
        String ssttrr = "Java is the most common programming language around the earth";
        System.out.println(Arrays.toString(ssttrr.toCharArray()));

    }
}
