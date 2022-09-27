package apcsaLessons2223;

public class Java11_ForLoops09222022
{
    public static void main(String[] args) throws InterruptedException
    {
        //  LOOP
        //  loops allows you to execute commands as many time as you need.
        //  there are three types of loops. for, while and do while.


        //  FOR LOOP
        //  start   condition  increment
        for(int i =0 ; i<=10 ; i++)  // this is going to increase number 1 by 1 from 0 to 10
        {
            //System.out.println(i);
        }

        for(int i = 2 ; i<=8 ; i+=3 ) // it increases 3 by 3 starts from 2 ends up at 8
        {
            //System.out.println(i);
        }

        for(int i = 0 ; i<100 ; i+=1) // this will print 100 times hellow world
        {
            //System.out.println("hello world");
        }

        for(int i =10 ; i>=0 ; i--)  //  it counts down from 10 to 0 one by one.
        {
            System.out.println(i);
        }

        //  task 1 print odd numbers until 1000
        //  task 2 print even number from 10 to 40.
        //  task 3 print the number can be divided by 5. from 0 - to 100
        //  task 3 print the number can be divided by 5 and/or 3. from 0 - to 100 use i++ in loop

        for(int i = 0 ; i<100 ;i++)
        {
            if(i%3==0||i%5==0)
            {
                System.out.println(i);
            }
        }

        //  NETSTED LOOP
        //  is a loop within another loop

        for(int i = 0 ; i<4 ; i++)
        {
            for(int j = 0 ; j<4 ; j++)
            {
                System.out.println("when i="+i+" j="+j);
            }
        }

        for(int i = 0, j=6 ; i<100 && j<100 ; i++,j++ )
        {
            System.out.println("i= "+i+", j="+j);
        }

        //  INFINITIVE LOOP
        //  if you want someting to run until forever
        for(int i = 0 ; true ; i++)
        {
            System.out.println("yellow world"+ " iteration number "+i);
        }


        //  WHILE LOOP
        //  while loop helps you to repead processes as many times as you need/want
        //  each loop has initialization termination and increment
        //  as the condition is tru loop keep running again and again.
        //  you can break the loop if you need.




    }
}
