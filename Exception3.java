import java.lang.*;
import java.util.*;

class Exception3
{
    public static void main(String a[])
    {
        int arr[] = {10,20,30,40,50};
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the index");
        int index = sobj.nextInt();

        try
        {
            System.out.println("Inside try");
            System.out.println("Element at that index is: "+ arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Inside catch");
            System.out.println("Exception occured as: "+ obj);
        }
        catch(Exception obj)
        {
            System.out.println("Inside e catch");
            System.out.println("Exception occured as: "+ obj);

        }
        finally
        {
            System.out.println("Inside finally");
            sobj.close();
        }

        System.out.println("End of application");

    }
}