package apcsaLessons2223;

public class Java14_StringClass09292022
{
    public static void main(String[] args)
    {
        //  Declaration of a string
        //  there are two ways to create a string 1 with double quote 2nd with new keyword.
        String str1 = "Hello World";
        String str2 = new String("Hello World 2");

        //  STRINGS ARE IMMUTABLE
        //  when you create a string it means unmodifiable or unchangeable.

        //  STRING POOL
        //  String pool in java corresponds to an allocation of memory in Java heap memory.
        //  it is collection of String objects,

        //  Strings are reprresednted with sequence of characters. (with index numbers)

        String str = "Mustafa";

        //  STRING MANIPULATION METHODS

        //  CHARAT str.charAt(indexNumber);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));

        // LENGTH this helps us to get the length of a string

        System.out.println(str.length());
        System.out.println("Trent".length());

        //  CONCATINATION  this is going to merge two given string
        System.out.println(str.concat(str2));
        String str3 = str1.concat(str2);
        System.out.println(str3);

        //  TO LOWERCASE AND UPPERCASE turns a given string to all upper or lower case
        String str4 = "MuHAMMer";
        System.out.println(str4.toLowerCase());
        System.out.println(str4.toUpperCase());

        //  TRIM removes unused spaces the spaces within a string from beginnig and end
        String str5 = "       T ren tE             ";
        System.out.println(str5.trim());

        //  SUBSTRING creates a substring of the string value from the begining index number and
        //  endign index number.
        String str6 = "Nathaniel";
        System.out.println(str6.substring(0,3));
        System.out.println(str6.substring(3,6));
        System.out.println(str6.substring(5,9));

        //  REPLACE replaces old value with new value
        String str7 = "seveneleven";
        System.out.println(str7.replace("e","a"));
        System.out.println(str7.replace("e"," "));

        //  REPLACEFIRST only replace first charcter matched
        System.out.println(str7.replaceFirst("e","i"));

        //  INDEX OF returns the index number of the first occured char as an int
        String str8 = "Trent";
        System.out.println(str8.indexOf("T"));
        System.out.println(str8.indexOf('T'));
        System.out.println(str8.lastIndexOf('t'));
        System.out.println(str8.indexOf("e"));

        //  EQUALS checks if two string are the same or not returns boolean

        System.out.println("ali".equals("ali"));
        System.out.println("ali".equals("ali2"));
        System.out.println("ali".equals("AlI"));
        System.out.println("ali".equalsIgnoreCase("ALI"));

        //  CONTAIINS check if string contains the string

        System.out.println("Alexander".contains("Alex"));
        System.out.println("Alexander".contains("alex"));  //  it is case sensitive so it returns false

        //  STARTS WITH it checks if the string starts with a string

        System.out.println("Alex".startsWith("A"));  //  return true
        System.out.println("Alex".startsWith("Al"));  //  return true
        System.out.println("Alex".startsWith("Ale"));   //  return true
        System.out.println("Alex".startsWith("Alex"));   //  return true

        //  ENDS WITH it checks if the string ends with a string

        System.out.println("Christian".endsWith("n"));  // true
        System.out.println("Christian".endsWith("an"));  // true
        System.out.println("Christian".endsWith("ian"));  // true
        System.out.println("Christian".endsWith("Christian"));  // true







    }
}
