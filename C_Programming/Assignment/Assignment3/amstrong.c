#include<stdio.h>
void main()
{
    int num;
    printf("Enter the number:");
    scanf("%d",&num);
    int temp=num;
    int count=0;
    while(temp>0)
    {
        temp=temp/10;
        count++;
    }
    temp=num;
    int sum=0;
    while(temp>0)
    {
        int rem=temp%10;
        int pow=1;
            for(int i=1;i<=count;i++)
            {
                pow=pow*rem;
            }
            sum=sum+pow;
            temp=temp/10;
        }
        if(num==sum)
        {
            printf(" It is a Armstrong number");
        }
        else
        {
            printf("It is not Armstrong no");
        }
    }

//output:Enter the number:153
 //It is a Armstrong number
 //Enter the number:1246
//It is not Armstrong no


