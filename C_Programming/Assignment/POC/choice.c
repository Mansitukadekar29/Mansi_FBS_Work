#include <stdio.h>
void main()
{
    int num;
    char ch;
    printf("Enter the number:");
    scanf("%d",&num);
    printf("Select the choice from the given list for checking  the number:");
    printf("\n1.Prime\n2.Armstrong\n3.Perfect\n4.Strong");
    printf("\nEnter your choice:");
    scanf(" %c",&ch);

    if(ch=='1')
    {
        int i = 2,flag=0;
        while(i<num){
            if(num%i ==0)
            {
                flag = 1;
                break;
            }
            i++;
        }
        if(flag==0)
        {
            printf("This is prime number");
        }
        else{
            printf("This is not prime number");
        }
    }

    else if(ch=='2')
    {
        int temp = num;
        int count = 0;
        while(temp!=0)
        {
        temp = temp /10;
        count++;
        }
        temp = num;
        int sum=0;
            while(temp>0)
            {
            int rem = temp % 10;
            int pow = 1;
            for(int i =1;i<=count;i++)
            {
            pow = pow * rem; 
            }
            sum = sum + pow;
            temp = temp / 10;
        }
        if(sum==num)
              printf("The number is Armstrong");
        else{
            printf("The number is not Armstrong");
        }
    }

    else if(ch=='3')
    {
        int sum = 0;
        for(int i=1;i<num;i++)
        { 
            if(num%i==0)
            {
               sum = sum + i;
            }   
        }
        if(num==sum)
            printf("This number is Perfect");
        else
            printf("This is not Perfect number");
    }

    else if(ch=='4')
    {
        int res = num;
        int sum = 0;
        while(num!=0)
        {
          int mod = num % 10;
          int fact = 1;
         while(mod!=0)
         {
            fact =fact * mod;
            mod--;
         }
         sum = sum + fact;
         num = num / 10;
        }
        if(res == sum)
        {
            printf("The number is strong number");
        }
        else
        {
            printf("The number is not strong number");
        }
    }
    else
        printf("Enter the valid number");
}

//output:Enter the number:153
// Select the choice from the given list for checking  the number:
// 1.Prime
// 2.Armstrong
// 3.Perfect
// 4.Strong
// Enter your choice:2
// The number is Armstrong