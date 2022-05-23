import java.lang.*;

class Demo
{
    public int i;
    public final int j = 20;
    public final int k;

    public Demo()
    {
        this.i = 10;
        this.k = 30;
    }
    public Demo(int a, int b)
    {
        this.i = a;
        this.k = b;
    }
    public void fun()
    {
        i++;
        // j++;
        // k++;
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("k: " + k);
    }
}

class Final1
{
    public static void main(String arg[])
    {
        Demo obj = new Demo();
        obj.fun();

        Demo objX = new Demo(11,21);
        objX.fun();
    }
}