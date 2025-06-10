#include<stdio.h>
void main()
{
    //int a=80,b=70,c=60;
    int a,b,c;
    printf("Enter the no:");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b && a>c)
    {
    printf("a is greatest no");
    }
    else if(b>c && c<a)
    {
    printf("b is greatest no");
    }
    else
    {
        printf("c is greatest no");
    }

}

//output:Enter the no:34 56 78
//c is greatest no