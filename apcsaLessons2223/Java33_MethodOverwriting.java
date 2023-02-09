package apcsaLessons2223;

public class Java33_MethodOverwriting
{

}
class Cars
{
    String make;
    String model;
    String engineSize;
    String batteryCapacity;
    public String getInfo()
    {
        return "the car is "+this.make+" and the model "+this.model+" and engine size is "+this.engineSize + " and the battery capacity is "+this.batteryCapacity;
    }
    public static void main(String[] args)
    {
        Cars car1 = new Cars();
        car1.make="honda";
        car1.model="accord";
        car1.engineSize="1.6";
        car1.batteryCapacity="avarage";
        car1.getInfo();

    }
}
class combustionEngineCar extends Cars
{
    public String getInfo()
    {
        return "the car is "+this.make+" and the model "+this.model+" and engine size is "+this.engineSize;
    }
}
class electricCar extends Cars
{
    public String getInfo()
    {
        return "the car is "+this.make+" and the model "+this.model+" and battery size is "+this.batteryCapacity;
    }
}
