import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int Size = in.nextInt();

        int arr[] = new int[Size];
        System.out.println("Enter elements in array:");

        for (int i = 0; i < Size; i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr)
    {
        int temp = 0;
        for (int i = 0,j = arr.length-1; i < j; i++,j--)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
