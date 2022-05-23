import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousFrame extends WindowAdapter implements ActionListener
{
    public Frame fobj;
    public TextField tobj1,tobj2,tobj3;
    public Button bobj1,bobj2,bobj3,bobj4;
    public Label lobj1,lobj2,lobj3;

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        
        tobj1 = new TextField();
        tobj1.setBounds(100,70,200,30);
        tobj2 = new TextField();
        tobj2.setBounds(100,140,200,30);
        tobj3 = new TextField();
        tobj3.setBounds(100,210,200,30);
        tobj3.setEditable(false);

        lobj1 = new Label("Enter First Number");
        lobj1.setBounds(100,40,150,30);
        lobj2 = new Label("Enter Second Number");
        lobj2.setBounds(100,110,110,30);
        lobj3 = new Label("Calculation is:");
        lobj3.setBounds(100,180,150,30);

        bobj1 = new Button("+");
        bobj1.setBounds(70,270,50,20);
        bobj2 = new Button("-");
        bobj2.setBounds(150,270,50,20);
        bobj3 = new Button("*");
        bobj3.setBounds(230,270,50,20);
        bobj4 = new Button("/");
        bobj4.setBounds(310,270,50,20);

        fobj.add(tobj1);
        fobj.add(tobj2);
        fobj.add(tobj3);
        fobj.add(bobj1);
        fobj.add(bobj2);
        fobj.add(bobj3);
        fobj.add(bobj4);
        fobj.add(lobj1);
        fobj.add(lobj2);
        fobj.add(lobj3);

        fobj.setSize(400,400);
        fobj.setLayout(null);
        fobj.setVisible(true);

        fobj.addWindowListener(this);
        bobj1.addActionListener(this);
        bobj2.addActionListener(this);
        bobj3.addActionListener(this);
        bobj4.addActionListener(this);
    }
    
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }

    public void actionPerformed(ActionEvent obj)
    {
        String str1 = tobj1.getText();
        String str2 = tobj2.getText();

        int iNo1 = Integer.parseInt(str1);
        int iNo2 = Integer.parseInt(str2);
        int iNo3 = 0;

        if(obj.getSource() == bobj1)
        {
            iNo3 = iNo1 + iNo2;            
        }
        else if(obj.getSource() == bobj2)
        {
            iNo3 = iNo1 - iNo2;
        }
        else if(obj.getSource() == bobj3)
        {
            iNo3 = iNo1 * iNo2;
        }
        else if(obj.getSource() == bobj4)
        {
            iNo3 = iNo1 / iNo2;
        }

        String iRet = String.valueOf(iNo3);
        tobj3.setText(iRet);

    }
    
}

class Calculator
{
    public static void main(String arg[])
    {

        MarvellousFrame mobj = new MarvellousFrame("Calculator");

    }
}