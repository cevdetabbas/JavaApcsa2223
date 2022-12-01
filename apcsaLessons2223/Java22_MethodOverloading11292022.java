package apcsaLessons2223;

public class Java22_MethodOverloading11292022
{
    /*
    -Method Overloading
    it allows you to have more than one method with the same name, but the method must have different parameters
    improves reusability
    improves readability
    return type does not need to be the same
    you can overload main method as well
     */
    public static int takeAverage(int a,int b)
    {
        return (a+b)/2;
    }
    public static int takeAverage(int a, int b, int c)
    {
        return (a+b+c)/3;
    }
    public static void main(String[] args)
    {
        System.out.println(takeAverage(4,8,7));
    }
}
