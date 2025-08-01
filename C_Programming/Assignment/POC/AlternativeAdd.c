#include<stdio.h>
void main()
{
    int start,end;
    int sum=0;
    int i;
    printf("Enter the start no:");
    scanf("%d",&start);
    printf("Enter the end no:");
    scanf("%d",&end);
    for(i=start;i<=end;i=i+2)
    {
        sum=sum+i;
    }
    printf("Addition of alternatives no:%d",sum);
}


//output:Enter the start no:1
// Enter the end no:9
// Addition of alternatives no:25