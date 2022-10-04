public class tryAndError
{
    public static void main(String[] args)
    {
        String pyramit = "";
        String spaces = "";

        for(int i = 0 ; i<10 ; i++)
        {
            pyramit+="|";
            spaces+=" ";
            System.out.println(spaces+pyramit+spaces);
            i++;
        }


    }
}
