#include<stdio.h>
void main()
{
    //int n=28,sum=0;
    int n,sum=0;
    printf("\n Enter the value:");
    scanf("%d",&n);
    int i=1;
    while(i<=n/2)
    {
        if(n%i==0)
        {
            sum=sum+i;
            
        }
      i++;
    }
    if(sum==n)
    {
      printf("The no is perfect");
    }
    
  
      else
      {
        printf("The no is not perfect");
      }

    }

    //output:Enter the value:28
    // The no is perfect

