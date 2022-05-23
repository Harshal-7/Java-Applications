// accept number from user and count frequency of such a digits which are less than 6

import java.io.*;

class Digits
{
    public int Count(int iNo)
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

            if(iDigit < 6)
            {
                iCnt++;
            }

            iNo = iNo / 10;
        }
        
        return iCnt;
    }   
}

public class A6Q5
{
    public static void main(String arg[]) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter a number:");
        int iValue = Integer.parseInt(bobj.readLine());

        Digits dobj = new Digits();

        int iRet = dobj.Count(iValue);

        System.out.println(iRet);

    }
}