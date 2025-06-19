#include<stdio.h>
void swap(int n1,int n2);
void main()
{
    int n1,n2,temp;
    printf("Enter the value of n1:");
    scanf("%d",&n1);
    printf("Enter the value of n2:");
    scanf("%d",&n2);
    swap(n1,n2);
}
void swap(int n1,int n2)
{
   int temp=n1;
    n1=n2;
    n2=temp;
    printf("After swapping n1=%d and n2=%d",n1,n2);
}

//output:Enter the value of n1:5
// Enter the value of n2:7
// After swapping n1=7 and n2=5