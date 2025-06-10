#include<stdio.h>
void main()
{
    int n1,n2;
    char ch;      
    printf("Enter the value of n1,n2:");
    scanf("%d%d",&n1,&n2);
    printf("Enter the operator:");
    printf("\n+\n-\n*\n/\n%%\n:>>");
    //fflush(stdin);
    scanf(" %c",&ch);
    if(ch=='+')
    {
        int sum=n1+n2;
        printf("The Addition is:%d",sum);

    }
    else if(ch=='-')
    {
        int sub=n1-n2; 
        printf("The substraction is:%d",sub);

    }
    else if(ch=='*')
    {
        int mul=n1*n2;
        printf("The Multiplication is:%d",mul);
    }
    else if(ch=='/')
    {
        int div=n1/n2;
        printf("\nThe division is:%d",div);

    }
    else if(ch=='%')
    {
        int mod=n1%n2;
        printf("\nThe modulo is:%d",mod);

    }
    else
    {
        printf("Enter the correct operatior");
    }
}

//output:Enter the value of n1,n2:5 6
// Enter the operator:
// +
// -
// *
// /
// %
// :>>+
// The Addition is:11
