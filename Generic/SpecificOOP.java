import java.lang.*;

// template <class T>

class Arithmetic <T>
{
    public int No1;
    public int No2;

    public Arithmetic(int a,int b)
    {
        this.No1 = a;
        this.No2 = b;
    }

    public int Addition()
    {
        int Ans = 0;
        Ans = No1 + No2;
        return Ans;
    }
}

class SpecificOOP
{
    public static void main(String arg[])
    {
        Arithmetic aobj = new Arithmetic(10,11);

        int Ret = aobj.Addition();

        System.out.println("Addition is: " + Ret);
    }
}