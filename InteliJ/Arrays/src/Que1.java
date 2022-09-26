import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

class Searching
{
    public int[] Arr;
    public int size;
    public int Target;

    public Searching(int Size)
    {
        this.size = Size;
        Arr = new int[this.size];
    }

    public void Accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter " + size + " Elements in Array : ");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = in.nextInt();
        }
        System.out.print("Enter the Value you want to Search: ");
        Target = in.nextInt();
    }

    public void Display(int Ans)
    {
        if(Ans == -1)
        {
            System.out.println("There is no such value in Array");
        }
        else
        {
            System.out.println(Target + " is present at index : " + Ans);
        }

    }


    public int BinarySearch()
    {
        int Start = 0;
        int End = size-1;
        int Mid = 0;
        int iPos = -1;

        while (Start <= End)
        {
            Mid = Start + (End - Start)/2;

            if(Target == Arr[Start])
            {
                iPos = Start;
                break;
            }
            else if (Target == Arr[End])
            {
                iPos = End;
                break;
            }
            else if (Target == Arr[Mid])
            {
                iPos = Mid;
                break;
            }
            else if (Target > Arr[Mid])
            {
                Start = Mid + 1;
            }
            else if (Target < Arr[Mid])
            {
                End = Mid - 1;
            }
        }

        return iPos;

    }

}

public class Que1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int iSize = in.nextInt();

        Searching obj = new Searching(iSize);
        obj.Accept();
        int iRet = obj.BinarySearch();
        obj.Display(iRet);

    }
}
