//Sum of Four Digits
#include <stdio.h>
void main()
{
    int n=1234;
    int r1=n%10;
    int q1=n/10;
    int r2=q1%10;
    int q2=q1/10;
    int r3=q2%10;
    int r4=q2/10;
    printf("The sum of no %d",r1+r2+r3+r4);

}
