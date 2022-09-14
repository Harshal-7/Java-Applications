import java.util.Scanner;

public class LinearSearch1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter target:");
        int target = in.nextInt();
        int ans = -1;
        int arr[] = {1,23,43,47,34,73,13,7,235,467,54,757,378,86,45,241,23};

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                 ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
