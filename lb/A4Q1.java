// which accept number from user and display it's multiplication factor

import java.io.*;

class Numbers
{
    public int iCnt;
    public int iMult;

    public int MultFact(int iNo)
    {
        iCnt = 0;
        iMult = 1;

        for(iCnt = 1 ; iCnt < iNo ; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iMult = iMult * iCnt;
            }
        }
        return iMult;
    }
}

class A4Q1
{
    public static void main(String arg[]) throws IOException
    {
        int iValue = 0;
        int iRet = 0;

        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);
        
        System.out.println("Enter number:");
        iValue = Integer.parseInt(bobj.readLine());

        Numbers obj = new Numbers();
        iRet = obj.MultFact(iValue);

        System.out.println("Output: " + iRet);

    }
}