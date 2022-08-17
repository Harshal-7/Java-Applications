import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] rollno = new int[5];

        for(int i = 0; i < rollno.length; i++)
        {
            rollno[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(rollno));

    }
}