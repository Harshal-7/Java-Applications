class Solution {
    public int findNumbers(int[] nums)
    {
        int iCnt = 0,countAns = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            iCnt = 0;
            while(nums[i] != 0)
            {
                nums[i] /= 10;
                iCnt++;
            }
            System.out.println("Icnt : " + iCnt);
            if(iCnt % 2 == 0)
            {
                countAns++;
            }
        }
        return countAns;
    }
}

public class LeetCode
{
    public static void main(String[] args)
    {
        Solution sobj = new Solution();
        int[] arr = {437,315,322,431,686,264,442};
        int iRet = 0;
        iRet = sobj.findNumbers(arr);
        System.out.println("Ans is : " + iRet);
    }

}
