#include<iostream>
using namespace std;

template <class T>
T Addition(T no1,T no2)
{
    T ans;
    ans = no1 + no2;
    return ans;
}

template <class T>
T Substraction(T no1,T no2)
{
    T ans;
    ans = no1 - no2;
    return ans;
}

int main()
{
    int value1 = 10,value2 = 11,ret = 0;
    float fvalue1 = 18.15, fvalue2 = 12.18, fret = 0.0;

    ret = Addition(value1,value2);
    cout << "Addition is : " << ret << endl;
    
    fret = Addition(fvalue1,fvalue2);
    cout << "Addition is : " << fret << endl;

    ret = Substraction(value1,value2);
    cout << "Substraction is : " << ret << endl;
    
    fret = Substraction(fvalue1,fvalue2);
    cout << "Substraction is : " << fret << endl;

    return 0;
}