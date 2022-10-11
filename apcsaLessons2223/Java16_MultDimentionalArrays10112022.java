package apcsaLessons2223;

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



    }
}
