// find the smallest number which is grater than or equal to the target element
public class Que2
{
    public static void main(String[] args)
    {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 17;
        int Ret = Search(arr,target);
        System.out.println(Ret);
    }

    static int Search(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        
        while (start <= end)
        {
            mid = start + (end + start/2);
            if(target == arr[mid])
            {
                break;
            }
            else if (target > arr[mid])
            {
                start = mid + 1;
            }
            else if (target < arr[mid])
            {
                end = end - 1;
            }
        }

        if(start > end)
        {
            return arr[start];
        }
        else
        {
            return arr[mid];
        }

    }

}
