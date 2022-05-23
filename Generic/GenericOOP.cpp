#include<iostream>
using namespace std;

template <class T>
class Arithmetic
{
    public:
        T No1;
        T No2;

    Arithmetic(T a,T b)
    {
        No1 = a;
        No2 = b;        
    }
    
    T Addition()
    {
        T Ans;
        Ans = No1 + No2;
        return Ans;
    }

    T Substraction()
    {
        T Ans;
        Ans = No1 - No2;
        return Ans;
    }

};

int main()
{
    Arithmetic <int>iobj(11,10);   
    int iRet = iobj.Addition();
    cout << "Addition is : " << iRet << endl;
    
    Arithmetic <double>dobj(11.11,10.10);   
    double dRet = dobj.Addition();
    cout << "Addition is : " << dRet << endl;

    return 0;
}