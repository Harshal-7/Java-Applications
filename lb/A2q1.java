// accept number from user and display it's multiplication of factors

import java.io.*;

public class A2q1
{
    public static void main(String arg[]) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter a number");
        int iValue = Integer.parseInt(bobj.readLine());

        int iRet = MultFact(iValue);
        System.out.println(iRet);
    }

    static int MultFact(int iNo)
    {
        int iCnt = 0;
        int iMult = 1;
    
        if(iNo < 0)
        {
            return iCnt;
        }
        
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