import java.lang.*;
import java.util.*;

class AL
{
    public static void main(String arg[])
    {
        ArrayList <String> obj = new ArrayList <String> ();

        obj.add("January");
        obj.add("February");
        obj.add("March");
        obj.add("Marvellous");
        obj.add("April");
        obj.add(2,"New");
        obj.add("May");
        obj.add("Marvellous");
        obj.add("Marvellous");
        obj.add("Marvellous");

        System.out.println("ArrayList contains: " + obj);
        System.out.println("size is " + obj.size());

        int i = 0;
        System.out.println("Elemens using for loop: ");
        
        for(i = 0; i < obj.size(); i++)
        {
            System.out.println(obj.get(i));
        }

        if(obj.contains("April"))
        {
            System.out.println("Element is there");
        }

        String str;
        int Cnt = 0;
        for(i = 0; i < obj.size(); i++)
        {
            str = obj.get(i);
            if(str.equals("Marvellous"))
            {
                Cnt++;
            }
        }
        System.out.println("Marvellous occurs " + Cnt + " times in ArrayList");
    
        int ret = obj.indexOf("April");
        System.out.println("Element is at index: " + ret);

        System.out.println("Element at index 3 is: " + obj.get(3));

        obj.remove(3);
        obj.remove("April");
        System.out.println("Updated list is : " + obj);

        obj.clear();
        System.out.println("Updated list is : " + obj);

    }
}