//accept no from user & print that no of even numbers on screen

import java.io.*;

class Q1
{
    public static void main(String arg[]) throws IOException
    {
        int iValue = 0;

        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj); 

        System.out.println("Enter a number:");
        iValue = Integer.parseInt(bobj.readLine());

        PrintEven(iValue);
    
    }

    public static void PrintEven(int iNo)
    {
        if(iNo <= 0)
        {
            return;
        }

        for(int iCnt = 2 ; iCnt <= (2*iNo) ; iCnt = iCnt + 2)
        {
            System.out.println(iCnt);
        }
    }

}