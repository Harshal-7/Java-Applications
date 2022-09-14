import java.util.ArrayList;
import java.util.Scanner;

public class AL
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>(3);
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(30);
//
//        System.out.println(list);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0 ;  i < 3; i++)
        {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);

    }

}
