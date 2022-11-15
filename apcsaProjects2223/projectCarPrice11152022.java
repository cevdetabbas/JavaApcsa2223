package apcsaProjects2223;

public class projectCarPrice11152022
{
//  Project Car Price
//  create a method with name methodCarPrice which takes 3 cars properties to calculate the value of the car
//  base price: $20.000
//  white color $2.000, black color $3.000, red color $5.000  ---  String
//  wheel 19inch $3.000, 21inch $5.000      ---  int
//  sunroof $6.000      ---  boolean

    public static int methodCarPrice(String color, int wheel , boolean sunroof)
    {
        int totalPrice = 0;
        int basePrice = 20000;
        totalPrice+=basePrice;
        if(color.equalsIgnoreCase("white"))
        {
            totalPrice=totalPrice+2000;
        }
        if(color.equalsIgnoreCase("black"))
        {
            totalPrice=totalPrice+3000;
        }
        if(color.equalsIgnoreCase("red"))
        {
            totalPrice=totalPrice+5000;
        }
        if(wheel==19)
        {
            totalPrice=totalPrice+3000;
        }
        if(wheel==21)
        {
            totalPrice=totalPrice+5000;
        }
        if(sunroof)
        {
            totalPrice=totalPrice+6000;
        }
        return totalPrice;
    }
}
