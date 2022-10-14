package apcsaLessons2223;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class J17_ArrayList1110142022
{
    public static void main(String[] args)

    {
        //  ARRAYLISTS
        //  preseneted in java util class.
        // is an ordered collection of values.
        // ArrayList is dynamic size arrays. so you do not have to specify
        //  we can add and remove arrays to from arraylist
        //  arraylist does not support primitives it only stores object


        //  DECLARATION
        ArrayList<String> arrList = new ArrayList<>();
        // or
        ArrayList<String> arrList2 = new ArrayList<String>();
        // or
        ArrayList<Integer> list10 = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        //  ARRAYLIST METHODS

        //  ADD
        arrList.add("Kristian");
        arrList.add("Alejandro");
        arrList.add("Nathaniel");
        System.out.println(arrList);

        //  GET
        System.out.println(arrList.get(1));

        //  SIZE
        System.out.println(arrList.size());

        //  CLEAR
        //  clears the array and remove all the values
        arrList.clear();
        System.out.println(arrList);

        // SET
        arrList.add(0,"Trent");
        System.out.println(arrList);
        arrList.set(0,"Christopher");
        System.out.println(arrList);

        //  CONTAINS
        System.out.println(arrList.contains("Christopher"));
        System.out.println(arrList.contains("Trent"));

        //  EQUALS METHOD you will check if two arraylist are the same or not
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("a","b","c"));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("a","b","c"));
        System.out.println(arr1.equals(arr2));  //  this will return true
        System.out.println(arrList.equals(arr2));  //  this will return false

        //  REMOVE METHOD
        System.out.println(arr1);
        arr1.remove("b");
        System.out.println(arr1);

        //  INDEX OF METHOD
        System.out.println(arr2.indexOf("c"));
        System.out.println(arr1.indexOf("c"));

        //  LAST INDEX OF
        arr2.add("4");
        arr2.add("5");
        arr2.add("6");
        arr2.add("a");
        System.out.println(arr2.lastIndexOf("a"));
        System.out.println(arr2.indexOf("a"));

        //  IS EMPTY checks if the list is empty or not returns true or false
        System.out.println(arr2.isEmpty());
        arr2.clear();
        System.out.println(arr2.isEmpty());


    }
}
