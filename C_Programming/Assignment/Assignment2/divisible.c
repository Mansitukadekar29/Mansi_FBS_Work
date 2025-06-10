#include<stdio.h>
void main()
{
    int num;
    printf("Enter the no:");
    scanf("%d",&num);
    if(num%3==0 && num%5==0)
    {
    printf("\nDivisible by both");
    }
    else if(num%3==0)
    {
        printf("\nDivisible by 3 but not by 5");
    }
    else if(num%5==0)
    {
        printf("\nDivisible by 5 but not by 3");
    }
    else
    {
        printf("\nDivisible by none");
    }


}

//output:Enter the no:6
//Divisible by 3 but not by 5
//Enter the no:25
//Divisible by 5 but not by 3