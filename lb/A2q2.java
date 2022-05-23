// accept number from user and display it's factors in decresing order

import java.io.*;

public class A2q2
{
    public static void main(String arg[]) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter a number");
        int iValue = Integer.parseInt(bobj.readLine());
        try
        {
            FactRev(iValue);
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured as : " + obj);
        }
    }

    static void FactRev(int iNo)
    {
        int iCnt = 0;
        try
        {
            for(iCnt = (iNo-1) ; iCnt < iNo ; iCnt--)
            {
                if(iNo % iCnt == 0)
                {
                    System.out.println(iCnt);
                }
            }
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured as : "+obj);
        }
    }

}