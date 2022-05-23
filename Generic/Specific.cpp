#include<iostream>
using namespace std;

int Addition(int No1, int No2)
{
    int Ans = 0;
    Ans = No1 + No2;
    return Ans;
}

float Addition(float No1, float No2)
{
    float Ans = 0;
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

    return 0;
}