#include<stdio.h>
#include<stdlib.h>

int main(int argc, char *argv[])
{
    int iAns = 0;
    
    printf("Name of Executable is : %s\n",argv[0]);
    printf("Number of command line arguments are : %d\n",argc);

    iAns = atoi(argv[1]) + atoi(argv[2]);
    printf("Addition is : %d\n",iAns);

    return 0;
}