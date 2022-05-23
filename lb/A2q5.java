// accept number from user and return diffrence between 
// summation of all it's factors and non-factors

import java.io.*;

class A2q5
{
    public static void main(String arg[]) throws IOException
    {
        int iValue = 0;
        int iRet = 0;
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);
        
        System.out.println("Enter a number:");
        iValue = Integer.parseInt(bobj.readLine());

        iRet = FactDiff(iValue);
        System.out.println("Difference is : " + iRet);
    }

    static int FactDiff(int iNo)
    {
        int iCnt = 0;
        int iSumFact = 0;
        int iSumNonFact = 0;
        int iDifference = 0;
        if(iNo < 0)
        {
            return 0;
        }

        for(iCnt = 1 ; iCnt < iNo ; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSumFact = iSumFact + iCnt;
            }
            else if(iNo % iCnt != 0)
            {
                iSumNonFact = iSumNonFact + iCnt;
            }
        }

        iDifference = iSumFact - iSumNonFact;
        return iDifference;
    }
}