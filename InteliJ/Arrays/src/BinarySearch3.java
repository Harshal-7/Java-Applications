public class BinarySearch3
{
    public static void main(String[] args)
    {
        int[] arr = {90,75,18,12,6,4,2,-1,-7,-15};
//        int[] arr = {-13,-5,0,1,5,13,23,34,54,65,76,82,95};
        int target = 12;
        int Index = BinarySearch(arr,target);

        if(Index == -1)
        {
            System.out.println("There is no such number in Array");
        }
        else
        {
            System.out.println("Number is Present in Array at Index : " + Index);
        }
    }

    static int BinarySearch(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length - 1;
        int middle = 0;
        int iPos = -1;

        if(nums[start] > nums[end])
        {
            while (start <= end)
            {
                middle = start + (end - start)/2;

                if(nums[middle] == target)
                {
                    iPos = middle;
                    break;
                }
                else if (nums[start] == target)
                {
                    iPos = start;
                    break;
                }
                else if (nums[end] == target)
                {
                    iPos = end;
                    break;
                }
                else if (target > nums[middle])
                {
                    end = middle - 1;
                }
                else if (target < nums[middle])
                {
                    start = middle + 1;
                }
            }
        }
        else
        {
            while (start <= end)
            {
                middle = start + (end - start)/2;

                if(nums[middle] == target)
                {
                    iPos = middle;
                    break;
                }
                else if (nums[start] == target)
                {
                    iPos = start;
                    break;
                }
                else if (nums[end] == target)
                {
                    iPos = end;
                    break;
                }
                else if (target > nums[middle])
                {
                    start = middle + 1;
                }
                else if (target < nums[middle])
                {
                    end = middle - 1;
                }
            }
        }

        return iPos;

    }

}
