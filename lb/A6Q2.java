// accept number from user and check whether it contains 0 in it or not

import java.io.*;

class Digits
{
    public boolean ChkZero(int iNo)
    {
        int iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit =  iNo % 10;

            if(iDigit == 0)
            {
                break;
            }

            iNo = iNo / 10;
        }

        if(iNo == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

public class A6Q2
{
    public static void main(String arg[]) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter a number:");
        int iValue = Integer.parseInt(bobj.readLine());

        Digits dobj = new Digits();

        boolean bRet = dobj.ChkZero(iValue);

        if(bRet == true)
        {
            System.out.println("It Contains Zero");
        }
        else
        {
            System.out.println("There is no Zero");
        }

    }
}