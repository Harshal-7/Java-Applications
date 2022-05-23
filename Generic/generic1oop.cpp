#include<iostream>
using namespace std;

template <class T>
class Arithmetic
{
    public:
        T no1;
        T no2;

    Arithmetic(T a,T b)
    {
        no1 = a;
        no2 = b;
    }

    T Addition()
    {
        T ans = 0;
        ans = no1 + no2;
        return ans;
    }

};

int main()
{
    int ret = 0;
    float fret = 0.0;

    Arithmetic <int>iobj(10,11);
    ret = iobj.Addition();
    cout << "Addition is " << ret << endl;
    

    Arithmetic <float>fobj(10.56,11.12);
    fret = fobj.Addition();
    cout << "Addition is " << fret << endl;

    return 0;
}