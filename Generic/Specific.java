import java.lang.*;

class Arithmetic
{
    public int Addition(int No1,int No2)
    {
        int Ans = 0;
        Ans = No1 + No2;
        return Ans;
    }
}

class Specific
{
    public static void main(String arg[])
    {
        Arithmetic aobj = new Arithmetic();
        int Ret = aobj.Addition(10,11);
        System.out.println("Addition is: " + Ret);
    }
}