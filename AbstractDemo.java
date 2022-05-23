import java.lang.*;

abstract class RBI
{
    public int Balance;
    public RBI()
    {
        this.Balance = 0;
    }

    public void Credit(int Amount)
    {
        this.Balance = this.Balance + Amount;
    }
    
    public void Debit(int Amount)
    {
        this.Balance = this.Balance - Amount;
    }

    public abstract int CalculateInterest();

}

class SBI extends RBI
{
    public int CalculateInterest()
    {
        return 6;
    }
}

class PNB extends RBI
{
    public int CalculateInterest()
    {
        return 7;
    }

}

class AbstractDemo
{
    public static void main(String arg[])
    {
        SBI sobj = new SBI();
        sobj.Credit(1000);
        sobj.Debit(200);

        System.out.println(sobj.Balance);

    }
}