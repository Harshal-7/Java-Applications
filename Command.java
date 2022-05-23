import java.lang.*;
import java.io.*;

class Command
{
    public static void main(String arg[])
    {
        System.out.println("First number is : " + arg[0]);
        System.out.println("Second number is : " + arg[1]);

        int Ans = Integer.parseInt(arg[0]) + Integer.parseInt(arg[1]);
        System.out.println("Addition is : " + Ans);
    }
}