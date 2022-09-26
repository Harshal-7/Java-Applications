public class Exam1
{
    public static void main(String[] args)
    {
        int Ret = FindDivisible(1,15,2);
        System.out.println(Ret);
    }

    static int FindDivisible(int a,int b,int n)
    {
        int no = 0;
        int sum = 0;
        int iCnt = 0;

        for(int i = a; i <= b; i++)
        {
            if(i % 2 != 0)
            {
                no = i;
                sum = 0;
                while(no != 0)
                {
                    sum += (no % 10);
                    no /= 10;
                }
                if(sum % n == 0)
                {
                    iCnt++;
                }
            }
        }
        return iCnt;
    }

}
