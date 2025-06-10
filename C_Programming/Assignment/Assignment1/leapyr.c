#include<stdio.h>
void main()
{
    int year;
    printf("Enter the year:");
    scanf("%d",&year);
    if(year%4==0 && year%100 !=0 || year%400==0)
    {
        printf("The year is leap");
    }
    else
    {
        printf("The year is not leap");
    }
}

//output:Enter the year:2003
// The year is not leap
// Enter the year:2004
// The year is leap