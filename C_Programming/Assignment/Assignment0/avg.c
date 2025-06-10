//Write a C program to input five numbers and find their average.
#include<stdio.h>
void main()
{
    int n1,n2,n3,n4,n5,avg,sum;
    printf("Enter the value:");
    scanf("%d%d%d%d%d",&n1,&n2,&n3,&n4,&n5);
    sum=n1+n2+n3+n4+n5;
    avg=sum/5;
    printf("The average value of no:%d",avg);
}

//Output:Enter the value:2 3 4 5 6
//The average value of no:4