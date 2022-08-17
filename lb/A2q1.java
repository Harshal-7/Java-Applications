// accept number from user and display it's multiplication of factors
import java.lang.*;
import java.io.*;

class Numbers
{
    public int iNo;

    public void Accept() throws IOException
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number:");

        iNo = Integer.parseInt(bobj.readLine());        
    }
    public void Display()
    {
        System.out.println("The Number is: " + iNo);
    }

    int MultFact()
    {
        int iMult = 1;

        for(int i = 1; i <= iNo/2; i++)
        {
            if(iNo % i == 0)
            {
                iMult *= i;
            }
        }

        return iMult;
    }
}

public class A2q1
{
    public static void main(String arg[]) throws IOException
    {
        // InputStreamReader iobj = new InputStreamReader(System.in);
        // BufferedReader bobj = new BufferedReader(iobj);

        // System.out.println("Enter a number");
        // int iValue = Integer.parseInt(bobj.readLine());

        Numbers nobj = new Numbers();
        nobj.Accept();
        nobj.Display();
        int iRet = nobj.MultFact();
        System.out.println("Multiplication of Factors is: " + iRet);
    }
}