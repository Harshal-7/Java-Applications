// accept number from user and display it's digits in reverse order

import java.io.*;

class Digits
{
    public void DisplayDigit(int iNo)
    {
        int iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}

public class A6Q1
{
    public static void main(String arg[]) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter a number:");
        int iValue = Integer.parseInt(bobj.readLine());

        Digits dobj = new Digits();

        dobj.DisplayDigit(iValue);      

    }
}