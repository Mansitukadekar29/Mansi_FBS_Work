#include <stdio.h>
void main()
{
    int base,expo;
    int pow=1; 
    printf("Enter the base:");
    scanf("%d",&base);
    printf("Enter the exponent:");
    scanf("%d",&expo);
    for(int i=1;i<=expo;i++)
    {
        pow=pow*base;
    }
    printf("%d^%d=%d\n",base,expo,pow);
    
}

//output:Enter the base:2
// Enter the exponent:4
// 2^4=16
