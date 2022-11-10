package apcsaLessons2223;

public class Java19_WrapperClass11012022
{
    public static void main(String[] args)
    {
/*
     //  WRAPPER CLASS
     wrapper class is dedicated to its primitives (int byte long float short boolean double char)
     wrapper class names starts with capital letter
     every primitive has its own wrapper class
     wrapper class is different then primitives since they are objects.

     PRIMITIVES(default values)                 WRAPPER CLASS(default names)
     byte           0                           Bye                null
     short          0.0                         Short              null
     long           0                           Long               null
     float          0.0                         Float              null
     double         0.0                         Double             null
     boolean        false                       Boolean            null
     char           ` `                         Char               null
*/

        //  Boxing and AutoBoxing
        //  if you convert primitive to wrapper it is autoboxing/boxin
        int a = 3;
        Integer b = a;

        //  Unboxing
        //  if you assign/convert wrapper to primitive it is unboxing
        Character c = 'A';
        char c2 = c; //  unboxing

        //  you can convert a double to an integer but you cannot convert a Double to Integer
        //  since wrapper class is dedicated to its primitives.
        int d = 3;
        double e = d;

        Integer f = 3;
        //Double g =f; // since wrapper class is dedicated to its primitives.

        //  WRAPPER CLASS METHODS
        int maxNumberOfGivenTwoInt = Integer.max(3,6);
        int maxNumberOfIntClass = Integer.MAX_VALUE;
        System.out.println(maxNumberOfIntClass);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.sum(5,8));
        System.out.println(Integer.hashCode(6));


        String str = "123";
        int number = 123;

        //  PARSINT AND VALUE OF METHODS
        System.out.println(Integer.toString(123));  //  this will convert int to String
        System.out.println(Integer.valueOf(str)+123); //  this will convert String to int
        System.out.println(String.valueOf(123));    //  this vill convert int to String
        System.out.println(Integer.parseInt(str)+123);//  this will convert String to int
        double p = 3.9;
        double k = (int)p;
        System.out.println(k);











    }
}
