import java.util.Arrays;
import java.util.Scanner;

public class Input
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int ArraySize = in.nextInt();

//        int[] arr = new int[ArraySize];
//
//        System.out.println("Enter Elements in array:");
//
//        for (int i = 0; i < arr.length; i++)
//        {
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println("Elements from array are:");
//
//        for (int i = 0; i < arr.length; i++)
//        {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println("\nUsing for Each:");
//
//        for(int nums : arr)
//        {
//            System.out.print(nums + " ");
//        }
//
//        System.out.println("\nusing Array toString method:");
//
//        System.out.println(Arrays.toString(arr));

        String[] str = new String[ArraySize];

        System.out.println("Enter elements in string array:");

        for (int i = 0; i < str.length; i++)
        {
            str[i] = in.next();
        }

        for(String sref : str)
        {
            System.out.print(sref + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(str));


    }
}
