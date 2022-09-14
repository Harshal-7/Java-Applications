import java.util.Arrays;
import java.util.Scanner;

public class Swap
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int arr[] = {1,3,54,64,325};

        System.out.print("Enter index 1: ");
        int index1 = in.nextInt();
        System.out.print("Enter index 2: ");
        int index2 = in.nextInt();

        System.out.println(Arrays.toString(arr));
        swap(arr,index1,index2);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1, int index2)
    {
        int temp = 0;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
