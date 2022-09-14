import java.util.Arrays;
import java.util.Scanner;

public class MultiDementional
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter elements in array:");

        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }

        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[k].length; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }
    }
}
