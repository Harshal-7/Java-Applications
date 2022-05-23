//accept no from user & print even factors of that number

import java.io.*;

class Q2
{
    public static void main(String arg[]) throws IOException
    {
        int iValue = 0;

        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter a number:");
        iValue = Integer.parseInt(bobj.readLine());

        DisplayEvenFactor(iValue);

    }

    static void DisplayEvenFactor(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt < iNo ; iCnt++)
        {
            if(iNo % iCnt == 0 && iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}