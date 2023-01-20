package apcsaLessons2223;

public class Java29_ThisKeyword
{
    // if you need to use your instance varible within a method with the arguments
    //  you can use same variable and you can differ them with this keyword
    // this keyword wihtin the method refers to instance variable created withing the class.

    String name;
    String lastName;

    public String getFullName(String a, String lastName)
    {
        name=name;
        this.lastName=lastName;
        return "Person`s first and last name is "+name+" "+lastName;
    }


}

