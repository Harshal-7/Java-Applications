import java.util.Scanner;

class Searching
{
    public int[] arr;
    public int target;

    public Searching(int Size)
    {
        arr = new int[Size];
    }

    public void Accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Elements in array:");

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the Element you want to search:");
        target = in.nextInt();
    }

    public void Display(int Ans)
    {
        if(Ans == -1)
        {
            System.out.println("There is no such element is Array");
        }
        else
        {
            System.out.println("The element is present in Array at index : " + Ans);
        }
    }

    public int BinarySearch()
    {
        int Start = 0;
        int End = arr.length - 1;
        int Mid = 0;
        int iPos = -1;

        while (Start <= End)
        {
            Mid = Start + (End-Start)/2;

            if(arr[Mid] == target)
            {
                iPos = Mid;
                break;
            }
            else if(arr[Start] == target)
            {
                iPos = Start;
                break;
            }
            else if(arr[End] == target)
            {
                End = Mid;
                break;
            }
            else if(target > arr[Mid])
            {
                Start = Mid + 1;
            }
            else if(target < arr[Mid])
            {
                End = Mid - 1;
            }
        }
        return iPos;
    }

}

public class BinarySearchOOP
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int Size = in.nextInt();

        Searching sobj = new Searching(Size);
        sobj.Accept();
        int iRet = sobj.BinarySearch();
        sobj.Display(iRet);

    }
}
