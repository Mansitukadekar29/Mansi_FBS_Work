#include<stdio.h>
void main()
{
    int x=5,y=3,sum=0;
    for(int i=3;i<=4;i++)
    {
        x=x+i;
        for(int j=1;j<=i;j++)
        {
            sum=sum+x;
            x=y;
            y=i+2;
        }
    }
        printf("\nThe value of  x=%d,y=%d,sum=%d",x,y,sum);
}

//output:The value of  x=6,y=6,sum=42
    