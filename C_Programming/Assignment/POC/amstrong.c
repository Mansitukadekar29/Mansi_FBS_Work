#include<stdio.h>
void main()
{
    int num,r1,r2,r3,q1,res;
    printf("Enter the no:");
    scanf("%d",&num);
    r1=num%10;//153
    q1=num/10;
    r2=q1%10;
    r3=q1/10;
    
    res=(r1*r1*r1)+(r2*r2*r2)+(r3*r3*r3);
    if(num==res)
    {
        printf("The no is amstrong");
    }
    else
    {
        printf("The no is not amstrong");
    }

}

//output:Enter the no:153
// The no is amstrong