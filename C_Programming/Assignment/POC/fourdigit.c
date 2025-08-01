//Sum of Four Digits
#include <stdio.h>
void main()
{
    int n=1234;
    int r1=n%10; //4
    int q1=n/10;
    int r2=q1%10; //123
    int q2=q1/10;
    int r3=q2%10; //12
    int r4=q2/10; //1
    printf("The sum of no %d",r1+r2+r3+r4);

}

//output:The sum of no 10
