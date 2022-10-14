package apcsaLessons2223;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Java16_MultDimentionalArrays10112022
{

    public static void main(String[] args)
    {
        //  MULTI DIMENTINAL ARRAYS n dimentional arrays
        //  contains multiple (n-1) single dimentional array

        //  DECLARATION OF TWO DIMENTINAL ARRAY
        int[] arr = {3,6,8};  //  one dimentional arrays
        int[][] arr2d = {{3,6,8},{332,116,338}};  //  two dimentional array

        //  PRINT SPECIFIC VALUES
        System.out.println(arr2d[0][0]);
        System.out.println(arr2d[0][1]);
        System.out.println(arr2d[0][2]);
        System.out.println(arr2d[1][0]);
        System.out.println(arr2d[1][1]);
        System.out.println(arr2d[1][2]);

        //  USERNAMES AND USERIDS
        String[][] classRoster = {{"Kris","alex","nat"},{"123","212","333"}};

        System.out.println("number 2 student "+classRoster[0][2]+" and its number "+classRoster[1][2]);


        // DECLERATION OF 3D ARRAY
        String[] arr1D = {"A","b"};
        // index numbers   0   1
        String[][] arr2D = {{"a","b","c"},{"d","z","f"}};
        // index numbers     0   1   2     0   1   2
        // index number          0             1
        int[][][] arr3D = {{{1,2,3},{4,5,6}}, {{7,8,9},{11,22,33}} , {{12,22,33},{14,25,36}},{{1222,22333,44433},{1444,2115,32226}} };
        // index numbers     0 1 2   0 1 2      0 1 2    0  1  2        0  1  2    0  1  2
        // index numbers       0       1          0         1              0          1
        // index numbers            0                  1                         2


        //  PRINTING ARRAYS DEEP TO STRING METHOD
        System.out.println(Arrays.deepToString(arr3D));

        //  PRINTING SPECIFIC VALUES
        System.out.println(arr3D[0][1][2]);  //  this will return  6
        System.out.println(arr3D[1][1][2]);  //  this will return  33
        System.out.println(arr3D[1][0][2]);  //  this will return  9

        //  ASSIGNING SPECIFIC VALUE
        arr3D[1][0][2]=99; // this will assing the value 99 to specific index number. So 9 will becaome 99
        System.out.println(Arrays.deepToString(arr3D));

        //  PRINTING SPECIFIC ARRAYS WITHIN MULTI DIMENTIONAL ARRAY
        System.out.println(Arrays.toString(arr3D[0][1]));  // this is going to print  [4, 5, 6]],
        System.out.println(Arrays.deepToString(arr3D[0])); //  returns [[1, 2, 3], [4, 5, 6]]

        //  ARRAYS LENGHT
        System.out.println(arr3D[0][1].length);
        System.out.println(arr3D[0].length);
        System.out.println(arr3D.length);

        // CREATE AN ARRAY TO PRINT EVEN NUMBERS FROM 1 TO 100 INCLUSIVE
        int[] arr4 = new int[51];

        for(int i = 0 ,a=0 ;i<=100 ; i+=2,a++)
        {
            arr4[a]=i;
            System.out.println(Arrays.toString(arr4));

        }
        System.out.println(Arrays.toString(arr4));


    }
}
