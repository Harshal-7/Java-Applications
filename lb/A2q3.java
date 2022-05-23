// accept number from user and display all its non-factors

import java.io.*;

class A2q3
{
    public static void main(String arg[]) throws IOException
    {
        int iValue = 0;

        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter a number");
        iValue = Integer.parseInt(bobj.readLine());

        NonFact(iValue);

    }

    static void NonFact(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            return;
        }
         
        for(iCnt = 1 ; iCnt < iNo ; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                System.out.println(iCnt);
            }
        }

    }

}