import java.util.*;

class Exception2
{
    public static void main(String arg[])
    {
        int ans = 0, iNo1 = 0, iNo2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number:");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second number:");
        iNo2 = sobj.nextInt();

        try
        {
            ans = iNo1 / iNo2;         //Exception prone code
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Exception occured as: "+obj);
        }
        finally
        {
            sobj.close();
        }
        System.out.println("Division is: "+ans);
    }
}