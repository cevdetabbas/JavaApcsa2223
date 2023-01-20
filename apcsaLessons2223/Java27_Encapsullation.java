package apcsaLessons2223;

public class Java27_Encapsullation
{
    //  encapsullation enables private variale/methods to be enable from outside of the class with
    //  setter and getter methods
    // this keyword let you use the instance variable within the class, if they have same name variable as argument you can use it alone


    private String name = "alex";
    private String LastName = "alex`sLastName";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getSSN() {
        return SSN;
    }



    private int SSN = 1234567;
}
class anotherClass
{
    public static void main(String[] args) {
    Java27_Encapsullation object1 = new Java27_Encapsullation();
    object1.setName("not Alex");
    //object1.setSSN(1111111);
        System.out.println(object1.getName());
        System.out.println(object1.getSSN());

    }
}
