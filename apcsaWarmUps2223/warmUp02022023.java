package apcsaWarmUps2223;

public class warmUp02022023
{
    public static boolean array123(int[] arr)
    {
        boolean a = false;
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(arr[i]==1&&arr[i+1]==2&&arr[i+2]==3)
            {
                a=true;
            }
        }
        return a;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(array123(arr));

    }
}
