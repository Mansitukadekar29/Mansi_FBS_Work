#include<stdio.h>
void isarmstrong(int*);
void main()
{
    int num;
    printf("Enter the number:");
    scanf("%d",&num);
    isarmstrong(&num);

} 
void isarmstrong(int* num) 
{
    int temp=*num;
    int count=0;
    while(temp>0)
    {
        temp=temp/10;
        count++;
    }
    temp=*num;
    int sum=0;
    while(temp>0)
    {
        int rem=temp%10;
        int pow=1;
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
        if(*num==sum)
        {
            printf(" It is a Amstrong number");
        }
        else
        {
            printf("It is not Amstrong no");
        }
    }
    
}

//output:Enter the number:145
//It is not Amstrong no
// Enter the number:153
// It is a Amstrong number