// accept number from user and return summation of all it's non-factors

import java.io.*;

class A2q4
{
    public static void main(String arg[]) throws IOException
    {
        int iValue = 0;
        int iRet = 0;
        
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);
        
        System.out.println("Enter a number");

        iValue = Integer.parseInt(bobj.readLine());

        iRet = SumNonFact(iValue);
        System.out.println("The summation of non-factors is: " + iRet);
    }

    static int SumNonFact(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        if(iNo < 0)
        {
            return 0;
        }

        for(iCnt = 1 ; iCnt < iNo ; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}