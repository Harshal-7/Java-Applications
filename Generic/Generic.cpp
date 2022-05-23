#include<iostream>
using namespace std;

template <class T>

T Addition(T No1, T No2)
{
    T Ans = 0;
    Ans = No1 + No2;
    return Ans;
}

int main()
{
    int Value1 = 10,Value2 = 11,iRet = 0;
    iRet = Addition(Value1,Value2);
    cout << "Addition is : " << iRet << endl;

    float fValue1 = 10.8,fValue2 = 11.5,fRet = 0.0;
    fRet = Addition(fValue1,fValue2);
    cout << "Addition is : " << fRet << endl;

    double dValue1 = 102.833,dValue2 = 121.533,dRet = 0.0;
    dRet = Addition(dValue1,dValue2);
    cout << "Addition is : " << dRet << endl;

    return 0;
}