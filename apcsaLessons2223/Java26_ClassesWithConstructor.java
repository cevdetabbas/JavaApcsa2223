package apcsaLessons2223;

public class Java26_ClassesWithConstructor
{

}
class Person
{
    String name;
    String lastName;
    int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args)
    {
//        Person person1 = new Person();
//        person1.name="nathanil";
//        person1.lastName="nathanielsLastName";
//        person1.age=16;
        Person person1 = new Person("nathaniel","LastNameOfNathaniel",22);
        System.out.println(person1.age);

    }
}
