package apcsaLessons2223;

public class Java32_SuperKeyword {
    //  super keyword is used to call variables/methods/constructor within the parent class which is inherited
    //  if both class has same variable or just wanted to call parent classes fields/properties super keyword is used

}
class Parent
{
    String name="nathaniel`s father";
    public void printName()
    {
        System.out.println(name);
    }
}
class Child extends Parent
{
    String name = "nathaniel";
        public void printName()
    {
        System.out.println(name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.printName();

    }

}
