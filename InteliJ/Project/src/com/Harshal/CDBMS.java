package com.Harshal;

import java.awt.*;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;
import java.util.WeakHashMap;

class Anime
{
    public int No;
    public String Name;
    public String MC;
    public float Rating;

    static int Generator;

    static
    {
        Generator++;
    }

    public Anime(String name, String mc, float rating)
    {
        No = Generator;
        Name = name;
        MC = mc;
        Rating = rating;
    }
}

class DBMS
{
    public LinkedList<Anime> lobj;

    public DBMS()
    {
        lobj = new LinkedList<>();
    }

    public void StartDBMS()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("\nCustomized DBMS started successfully...");

        String Query1 = "";
        String Query = "";

        while(true)
        {
            System.out.print("\nDBMS console > ");

            Query1 = in.nextLine();
            Query = Query1.toLowerCase();

            String[] tokens = Query.split(" ");

            int QuerySize = tokens.length;

            if(QuerySize == 1)
            {
                if("help".equals(tokens[0]))
                {
                    System.out.println("\nThis Application is used to demonstrate customized DBMS");
                    System.out.println("\nInsert Data                   :   INSERT INTO Anime values ( Name MC Rating )");
                    System.out.println("Insert Data example           :   INSERT INTO Anime values ( One_Piece Luffy 10 )");
                    System.out.println("Insert Data instruction       :   Please give space after bracket as above example");
                    System.out.println("\nDisplay Data                  :   SELECT * FROM Anime");
                    System.out.println("Display Specific Data         :   SELECT * FROM Anime WHERE_CONDITION");
                    System.out.println("Display Specific Data example :   SELECT * FROM Anime WHERE MC = luffy");
                    System.out.println("\nDelete Specific               :   DELETE FROM Anime WHERE_CONDITION");
                    System.out.println("\nDelete Specific               :   DELETE FROM Anime WHERE Rating = 7.5");
                    System.out.println("\nExit                          :   Terminate the Application");
                }
                else if("exit".equals(tokens[0]))
                {
                    System.out.println("\nThank You For Using DBMS...\n");
                    break;
                }
                else if ("chk".equals(tokens[0]))
                {
                    DisplayAll();
                }
                else
                {
                    System.out.println("Invalid Command....");
                    System.out.println("Please enter 'help' in console for the help");
                }
            }
            else if(QuerySize == 4)
            {
                if("select".equals(tokens[0]) && "*".equals(tokens[1]) && "from".equals(tokens[2]) && "anime".equals(tokens[3]))
                {
                    DisplayAll();

                }
            }

        }

    }

    public void InsertData(String name, String mc, int rating)
    {
        Anime aobj = new Anime(name,mc,rating);
        lobj.add(aobj);
    }

    public void DisplayAll()
    {
        System.out.println("---------------------------------------------------------");

        for(Anime aref : lobj)
        {
            aref.DisplayData();
        }

    }



}

public class CDBMS
{
    public static void main(String[] args)
    {
        DBMS dobj = new DBMS();

    }
}
