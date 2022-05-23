import java.lang.*;
import java.util.*;

class Demo
{
    public int Division(int no1,int no2) throws ArithmeticException
    {
        return no1/no2;
    }
}

class Exception4
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number");
        int no1 = sobj.nextInt();
        System.out.println("Enter second number");
        int no2 = sobj.nextInt();

        Demo obj = new Demo();
        try
        {
            int ret = obj.Division(no1,no2);
            System.out.println("division is: "+ret);
        }
        catch(ArithmeticException objx)
        {
            System.out.println("inside catch");
        }
    }
}