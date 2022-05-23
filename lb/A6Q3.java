// accept number from user and count frequency of 2 in it

import java.io.*;

class Digits
{
    public int CountTwo(int iNo)
    {
        int iDigit = 0;
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 2)
            {
                iCnt++;
            }

            iNo = iNo / 10;
        }

        return iCnt;
    }

}

public class A6Q3
{
    public static void main(String arg[]) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter a number:");
        int iValue = Integer.parseInt(bobj.readLine());
        
        Digits dobj = new Digits();

        int iRet = dobj.CountTwo(iValue);

        System.out.println(iRet);

    }
}