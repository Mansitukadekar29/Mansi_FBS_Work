#include<stdio.h>
void main()
{
    int n,i=1;
    printf("Enter the no to print the table:");
    scanf("%d",&n);
    printf("Multiplication table  of %d\n",n);
    while(i<=10)
    {
        printf("%d x %d=%d\n",n,i,n*i);
        i++; 
    }
}

//output:Enter the no to print the table:7
// Multiplication table  of 7
// 7 x 1=7
// 7 x 2=14
// 7 x 3=21
// 7 x 4=28
// 7 x 5=35
// 7 x 6=42
// 7 x 7=49
// 7 x 8=56
// 7 x 9=63
// 7 x 10=70