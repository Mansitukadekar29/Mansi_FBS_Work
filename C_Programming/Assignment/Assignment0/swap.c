//Write a C program to swap two numbers using a temporary third variable.
#include<stdio.h>
void main()
{
    int a=100,b=60,c;
    c=a-b;//the value of c will be the output for change the value
    a=a-c;//the value of a will be changed   //c=a;
    printf("the value of a:%d ",a);          //a=b;
    b=b+c;//The value of b will be changed   //b=c;
    printf("\nThe value of b:%d",b);
}

//Output:the value of a:60The value of b:100


