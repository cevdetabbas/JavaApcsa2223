package apcsaLessons2223;

import java.util.Arrays;
import java.util.Collection;

public class Java28_StaticKeyword
{
    // In the Java programming language, the keyword static means that the particular member belongs to a type itself,
    // rather than to an instance of that type.   This means we'll create only one instance of that static member
    // that's shared across all instances of the class.

    //  we call instance variables with creating an object from its class
    //  we call static variables without creating an object only calling from its class name.
     String natName = "Nathaniel";
     static String natStaticName = "nathaniels Static Name";
     int natAge = 12;
}
class Static2
{
    public static void main(String[] args) {
        System.out.println(Java28_StaticKeyword.natStaticName);  //  this is how we call the static variable
        //System.out.println(Java28_StaticKeyword.natName);
        Java28_StaticKeyword java28StaticKeyword = new Java28_StaticKeyword();  //  this is how we call instance variable
        System.out.println(java28StaticKeyword.natName);
        System.out.println(Arrays.deepToString(Java16_MultDimentionalArrays10112022.arr2dd));
    }
}
