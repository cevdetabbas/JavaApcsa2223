package apcsaWarmUps2223;

public class warmUp01062023 {
    public static String startEndUpper(String str)
    {
        String firstLetterCapitilazed = str.substring(0,1).toUpperCase();

        String lastLetterCapitilazed = str.substring(str.length()-1,str.length()).toUpperCase();

        String lettersInTheMiddle = str.substring(1,str.length()-1).toLowerCase();


        return firstLetterCapitilazed+lettersInTheMiddle+lastLetterCapitilazed;
    }

    public static void main(String[] args) {
        System.out.println(startEndUpper("hello"));
    }



}
