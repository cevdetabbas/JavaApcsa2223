package apcsaLessons2223;

public class Java24_CustomClass01032023
{
    //  CUSTOM CLASS
    //  you can create your own custom class in java with your own instance variables and methods as well

    //  INSTANCE VARIABLE
    //  created outsice of the methods but within the class.
    //  we mainly use storing datas into objects it belongs to the objects, properties of the objects.
    //  it is also called fields
    //  localy created within the methods. not visible to the other methods. can be only used within the method .

    String StudentName="Muhammer"; //  this is an instance variable
    int StudnetIdNumber;  // this is anohter instance variable
    String StudnetTitle;
    long SSN;
    String Gender;
    double Salary;
    String DoB ;

    //  INSTANCE METHOD
    //  methods that does not have static specifier but do have return type

    public void WhatDoesItDo() {System.out.println(StudentName+" learning apcsa");}  //  this is the example of instance method

    public void GetInfo()
    {
        System.out.println("Student Name is "+StudentName+ " id number is "+StudnetIdNumber+" title is "+StudnetTitle);
    }

    //  you can create a class within a class
    //  you can set up default values for attributes of the class.
    public void getDOB()
    {
        System.out.println(StudentName+" borned in "+DoB);
    }
    public static void main(String[] args) {
        Java24_CustomClass01032023 student1 = new Java24_CustomClass01032023();
        student1.StudnetTitle="superStudent";
        student1.StudentName="Nathaniel";
        student1.StudnetIdNumber=123123123;
        student1.WhatDoesItDo();

        Java24_CustomClass01032023 student2 = new Java24_CustomClass01032023();
        student2.StudentName="Muhammer";
        student2.StudnetIdNumber=1111111;
        student2.StudnetTitle="LazyStudent";
        student2.DoB="11/11/1111";
        student2.GetInfo();

        student2.getDOB();




    }





}
