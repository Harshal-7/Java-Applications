#include<iostream>
using namespace std;

class Arithmetic
{
    public:
        int No1,No2;

    Arithmetic(int a,int b)
    {
        No1 = a;
        No2 = b;        
    }
    
    int Addition()
    {
        int Ans = 0;
        Ans = No1 + No2;
        return Ans;
    }

    int Substraction()
    {
        int Ans = 0;
        Ans = No1 - No2;
        return Ans;
    }

};

int main()
{
    int ret = 0;
    
    Arithmetic obj(11,10);
    
    ret = obj.Addition();
    cout << "Addition is : " << ret << endl;

    return 0;
}