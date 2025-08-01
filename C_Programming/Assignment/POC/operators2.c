#include<stdio.h>
void main()
{
    int n1,n2;
    char ch;      
    printf("Enter the value of n1,n2:\n ");
    scanf("%d%d",&n1,&n2);
    printf("\nEnter the operator:");
    printf("\n+\n-\n*\n/\n%%\n");
    fflush(stdin);
    scanf("%c",&ch);
    if(ch=='+')
    {
        int sum=n1+n2;
        printf("\nThe Addition is:%d",sum);

    }
    else if(ch=='-')
    {
        int sub=n1-n2; 
        printf("\n The substraction is:%d",sub);

    }
    else if(ch=='*')
    {
        int mul=n1*n2;
        printf("\n The Multiplication is:%d",mul);
    }
    else if(ch=='/')
    {
        int div=n1/n2;
        printf("\nThe division is:%d",div);

    }
    else if(ch=='%')
    {
        int mod=n1%n2;
        printf("\n The modulo is:%d",mod);

    }
    else
    {
        printf("Enter the correct operatior");
    }
}
