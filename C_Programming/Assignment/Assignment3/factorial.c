#include<stdio.h>
void main()
{
    int num,fact=1;
    printf("Enter the value of no.:");
    scanf("%d",&num);
    int temp=num;
    while(num)
    {
        fact=fact*num;
        num--;

    }
    printf("\nfactorial of no:%d is %d",temp,fact);
}

//output:Enter the value of no.:5
//factorial of no:5 is 120