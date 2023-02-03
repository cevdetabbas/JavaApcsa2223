package apcsaLessons2223;

import java.lang.ref.PhantomReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Java30_Predicate
{
    //  predicate does the job what an if statemt does but within only one line of code
    public static void main(String[] args)
    {
        //  create a list of number from 1 to 12 withing an arraylist then remove odd numbers
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
        Predicate<Integer> oddnumber = p -> p % 2 == 1;
        arr.removeIf(oddnumber);
        System.out.println(arr);

        //  create a list with students names and erase them with predicate if name starts with a and k
        ArrayList<String> stuList = new ArrayList<>(Arrays.asList("kRISTIAN","natha","alex","trent"));
        Predicate<String> startsWithAk = p -> p.startsWith("a") || p.startsWith("k");
        stuList.removeIf(startsWithAk);
        System.out.println(stuList);

        //  create a list of characters and remove if they are numbers.
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList('a','b','1','2'));
        Predicate<Character> onlyNumbers = p -> p.equals('1')||p.equals('2')||p.equals('3');
        charList.removeIf(onlyNumbers);
        System.out.println(charList);



    }
}
