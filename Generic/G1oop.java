import java.lang.*;

class Arithmetic <T>
{
    public T no1;
    public T no2;

    public Arithmetic(T a,T b)
    {
        this.no1 = a;
        this.no2 = b;
    }

    public T Addition()
    {
        if((no1 instanceof  Integer) && (no2 instanceof Integer))
        {
            return (T)(Integer)((Integer)no1 + (Integer)no2);
        }

        else if((no1 instanceof Float) && (no2 instanceof Float))
        {
            return (T)(Float)((Float)no1 + (Float)no2);
        }

        else if((no1 instanceof Double) && (no2 instanceof Double))
        {
            return (T)(Double)((Double)no1 + (Double)no2);
        }
        else
        {
            return null;
        }
    }

}

class G1oop
{
    public static void main(String arg[])
    {
        Arithmetic <Integer> obj1 = new Arithmetic <Integer> (100,111);

        int ret = obj1.Addition();
        System.out.println("Addition is " + ret);

        Arithmetic <Float> obj2 = new Arithmetic <Float> (15.4f,5.63f);

        float fret = obj2.Addition();
        System.out.println("Addition is " + fret);

    }
}