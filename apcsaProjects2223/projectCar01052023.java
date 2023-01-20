package apcsaProjects2223;

public class projectCar01052023
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.make="BMW";
        car1.model="X1";
        car1.color="White";
        car1.year=2014;
        car1.engineSize=2.8;
        Car car2 = new Car();
        car1.getInfo();
    }
}

class Car
{
    String make;
    String model;
    int year;
    int milage;
    String color;
    double engineSize;

    public void getInfo()
    {
        System.out.println("The car is "+year+" "+make+" "+model+" and it has "+milage+" mile on it with the engine size is "+engineSize+" liter");
    }

}






