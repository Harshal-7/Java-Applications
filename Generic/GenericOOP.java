import java.lang.*;

// template <class T>

class Arithmetic <T>
{
    public T No1;
    public T No2;

    Arithmetic(T a,T b)
    {
        this.No1 = a;
        this.No2 = b;
    }

    public T Addition()
    {
        if((No1 instanceof Integer) && (No2 instanceof Integer))
        {
            return (T)(Integer)((Integer)No1 + (Integer)No2);
        }

        else if((No1 instanceof Float) && (No2 instanceof Float))
        {
            return (T)(Float)((Float)No1 + (Float)No2);
        }
 
        else if((No1 instanceof Double) && (No2 instanceof Double))
        {
            return (T)(Double)((Double)No1 + (Double)No2);
        }
        else
        {
            return null;
        }
    }
}

class GenericOOP
{
    public static void main(String arg[])
    {
        Arithmetic <Integer> obj1 = new Arithmetic<Integer>(11,21);

        Integer ret = obj1.Addition();
        System.out.println("Addition is: " + ret);

        
        Arithmetic <Float> obj2 = new Arithmetic<Float>(10.35f,11.47f);

        Float fret = obj2.Addition();
        System.out.println("Addition is: " + fret);
    }
}