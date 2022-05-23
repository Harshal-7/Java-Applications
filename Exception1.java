import java.util.*;

class Exception1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number:");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter Second number:");
        int iNo2 = sobj.nextInt();

        int ans = iNo1 / iNo2;

        System.out.println("Division is: "+ans);
        sobj.close();
    }
}