package Harshal;

import java.util.Scanner;

class Numbers
{
    public int iNo;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the number : ");
        this.iNo = sobj.nextInt();
    }

    public void Display(boolean bRet)
    {
        if(bRet)
        {
            System.out.println(this.iNo + " is an Armstrong number");
        }
        else
        {
            System.out.println(this.iNo + " is Not an Armstrong number");
        }
    }

    public boolean Armstrong()
    {
        int temp = iNo;
        int iCnt = 0;

        while (temp != 0)
        {
            ++iCnt;
            temp /= 10;
        }

        temp = iNo;
        int iDigit = 0;
        int iSum = 0;
        while (temp != 0)
        {
            iDigit = temp % 10;
            iSum += Multiple(iDigit,iCnt);
            temp /= 10;
        }
        return iSum == iNo;
    }
    public int Multiple(int num,int header)
    {
        int Ans = 1;
        for(int i = 1; i <= header; i++)
        {
            Ans = Ans * num;
        }
        return Ans;
    }

    public void PrintArmstrong()
    {
        boolean bRet;
        for(iNo = 1; iNo <= 99999; iNo++)
        {
            bRet = Armstrong();
            if(bRet)
            {
                System.out.print(iNo + " ");
            }
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Numbers nobj = new Numbers();

//        nobj.Accept();
//        boolean bRet = nobj.Armstrong();
//        nobj.Display(bRet);
        nobj.PrintArmstrong();
    }
}