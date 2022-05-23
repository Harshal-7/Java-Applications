import java.lang.*;

// template <class T>

class Arithmetic <T>
{
    public T Addition(T No1,T No2)
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

class Generic
{
    public static void main(String arg[])
    {
        Arithmetic <Integer> obj1 = new Arithmetic<Integer>();

        Integer ret = obj1.Addition(10,11);
        System.out.println("Addition is: " + ret);

        
        Arithmetic <Float> obj2 = new Arithmetic<Float>();

        Float fret = obj2.Addition(10.5f,11.7f);
        System.out.println("Addition is: " + fret);
    }
}