package apcsaLessons2223;

public class Java31_Inheritance
{
    //  Inheritance build relationship between classes
    //   super(parent) & sub(child) relationships
    //  sub class : can inherit variables and methods from super class
    //  super class/parent class does not inherit anything
    //  advantage: improves re-usability and easy to maintain.
    public static void main(String[] args) {
        ElectricCar car1 = new ElectricCar();
        car1.made="Tesla";
        car1.model="Model S";
        car1.batterySize="100D";
        HybritCar car2 = new HybritCar();
        car2.made="Honda";
        car2.model="Accord";
        car2.hybritBatterRange="20 mile";


    }
}
class Car{
    String model;
    String made;
    int year;
}
class ElectricCar extends Car{

    String batterySize;
}
class HybritCar extends Car{
    String hybritBatterRange;
}
