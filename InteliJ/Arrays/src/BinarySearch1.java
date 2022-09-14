import java.util.Scanner;

public class BinarySearch1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int[] arr = {-12,-5,-3,0,2,14,23,34,37,57,87,99,202,502};
        int target = sobj.nextInt();
        int ret = BinarySearch(arr,target);

        if(ret == -1)
        {
            System.out.println("There is no such element in array");
        }
        else
        {
            System.out.println("Element is there in array at index : " + ret);
        }
    }
    static int BinarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int iPos = -1;

        while(start <= end)
        {
            mid = start + (end-start)/2;

            if(arr[mid] == target)
            {
                iPos = mid;
                break;
            }
            else if(arr[start] == target)
            {
                iPos = start;
                break;
            }
            else if(arr[end] == target)
            {
                iPos = end;
                break;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if(target < arr[mid])
            {
                end = mid - 1;
            }
        }

        return iPos;

    }

}
