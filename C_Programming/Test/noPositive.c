#include<stdio.h>
void main()
{
    int no;
    printf("Enter the no:");
    scanf("%d",&no);
    if(no>0)
    {
        printf("\n positive no");
    }
    else if(no<0)
    {
        printf("\n Negative no");
    }
    else{
        printf("The no is neutral");
    }
}