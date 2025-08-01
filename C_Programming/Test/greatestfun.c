#include<stdio.h>
int greatest();
void main()
{
    int x=greatest();
    if(x==1)
    {
        printf("a is greatest no");
    }
    else if(x==2)
    {
        printf("b is greatest no");
    }
    else
    {
        printf("c is greatest no");
    }
}
int greatest()
{
    int a,b,c;
    printf("Enter the no:");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b && a>c)
    {
    return 1;
    }
    else if(b>c && c<a)
    {
    return 2;
    }
    else
    {
        return 3;
    }
}

//output:Enter the no:34 56 67
//c is greatest no