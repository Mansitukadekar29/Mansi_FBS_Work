#include<stdio.h>
void isfact(int num);
void main()
{
    int num;
    printf("Enter the value of no.:");
    scanf("%d",&num);
    isfact(num);
//    printf("The factorial of no is:%d",x);
   
}
void isfact(int num)
{
    int fact=1;
    int temp=num;
    while(num)
    {
        fact=fact*num;
        num--;

    }
    
    printf("The factorial of %d is %d",temp,fact);
}

//output:Enter the value of no.:5
//The factorial of 5 is 120