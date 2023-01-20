package apcsaLessons2223;

public class Java25_AccessModifiers01102023
{
/*
    ACCESS MODIFIERS        SAME CLASS      SAME PACKAGE        SUB-CLASSES     EVERYWHERE ELSE
    public                      y                   Y                   Y               Y
    protected                   Y                   Y                   Y               N
    default                     Y                   Y                   N               N
    private                     Y                   N                   N               N


 */
    public String myPublicVariable="my Public Variable";
    protected String myProtectedVariable = "my Protected Variable";
    String myDefaultVariable = "my Default Variable";
    private String myPrivateVariable = "my Private Variable";

}

class newClass
{
    public static void main(String[] args) {
        Java25_AccessModifiers01102023 java25Encapsullation01102023 = new Java25_AccessModifiers01102023();
        System.out.println(java25Encapsullation01102023.myPublicVariable);
        System.out.println(java25Encapsullation01102023.myProtectedVariable);
        System.out.println(java25Encapsullation01102023.myDefaultVariable);
        // System.out.println(java25Encapsullation01102023.myPrivateVariable); we can not call this since it is private which belongs to
        //  its own class
    }
}
